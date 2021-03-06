package core.infrastructure.services.replacers.dart_replacer;

import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import core.infrastructure.services.replacers.TextReplacer;
import core.infrastructure.services.replacers.dart_replacer.insert_index_calculators.*;
import core.infrastructure.services.replacers.dart_replacer.walkers.ReaderWalker;
import antlr.training.TrainingLexer;
import antlr.training.TrainingParser;
import core.infrastructure.services.replacers.dart_replacer.walkers.WriterWalker;
import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholderContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.PlaceholdersContextsStorage;
import core.infrastructure.services.replacers.dart_replacer.contexts.ReleaseContext;
import core.infrastructure.services.replacers.dart_replacer.contexts.ReleaseContextsStorage;
import core.infrastructure.utils.TextUtilities;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//public class AddingReplacer extends BaseReplacer {
public class DartReplacer extends TextReplacer {
//    private final String templateText;
//    private final String releaseText;
//    private final Map<String, String> chunksMap;

    private PlaceholdersContextsStorage placeholdersContextsStorage;
    private ReleaseContextsStorage releaseContextsStorage;



    public DartReplacer(
            Path absolutePathToRelease,
            Path absolutePathToTemplate,
            String chunksDirectoryPostfix,
            String commandName,
//            Map<String, String> chunksMap,
            Map<String, String> options
    ) throws Exception {
        super(absolutePathToRelease, absolutePathToTemplate, chunksDirectoryPostfix, commandName, options);
//        chunksMap = (Map<String, String>) chunksMap;
        chunksMap = updateChunksMap((Map<String, String>) chunksMap, options);
        if(chunksMap.isEmpty()) {
            throw new Exception("?????? ????????????????-?????????????????????? ?????? ?????????? "+ absolutePathToTemplate);
        }
    }

    private Map<String, String> updateChunksMap(Map<String, String> chunksMap, Map<String, String> options) {
        Map<String, String> newChunksMap = new HashMap<>();
        CodePlaceholderHelper codePlaceholderHelper = new CodePlaceholderHelper();

        for(Map.Entry<String, String> chunkPair: chunksMap.entrySet()) {
            String chunkName = chunkPair.getKey();
            String chunkText = chunkPair.getValue();

            chunkText = codePlaceholderHelper.replaceAllPlaceholders(chunkText, options);
            chunkText = codePlaceholderHelper.deleteUnusedPlaceholders(chunkText, options);


            newChunksMap.put(chunkName, chunkText);
        }

        return newChunksMap;
    }
//    public AddingReplacer(String releaseText, String templateText, Map<String, String> chunksMap) {
//        this.releaseText = releaseText;
//        this.templateText = templateText;
//        this.chunksMap = chunksMap;
//    }

    public String replace() throws Exception {
        init();

        List<String> existsPlaceholders = getExistsPlaceholders();
        Set<String> chunksKeys = chunksMap.keySet();
        if(existsPlaceholders.isEmpty()) {
            throw new Exception("?? ?????????????? ???? ?????????????? ???? ???????? ???????? ???? " + chunksKeys);
        }

//        System.out.println(existsPlaceholders);
//        System.out.println("------------------------------------");

        return getNewReleaseText();
    }

    private String getNewReleaseText() throws Exception {
        ArrayList<String> releaseTextsChunks = new ArrayList<>();

        int insertFromIndex = 0;

        for(ReleaseContext releaseContext: releaseContextsStorage.getContexts()) {
            List<PlaceholderContext> placeholdersContexts = releaseContext.getPlaceholdersContexts();
            for(PlaceholderContext placeholderContext: placeholdersContexts) {
                InsertInfo insertInfo = getIndexToInsert(placeholderContext, releaseContext);
                int insertToIndex = insertInfo.getIndexToInsert();

                String replacementText;

                if(insertInfo.isTopAttaching()) {
                    replacementText = buildTopReplacementText(placeholderContext, templateText, (Map<String, String>) chunksMap);
                    int firstLineSize = TextUtilities.getFirstLine(releaseText).length();

                    if(insertToIndex < firstLineSize) {
                        replacementText = replacementText + "\r\n";
                        replacementText = TextUtilities.trimFirstBreakLine(replacementText);
                    }
                }else{
                    String beforeIndexText = releaseText.substring(insertFromIndex, insertToIndex);
                    Pattern pattern = Pattern.compile("\n([ \r\t]*?)$");
                    Matcher matcher = pattern.matcher(beforeIndexText);

                    String offset = "";
                    if(matcher.find()) {
                        offset = matcher.group(1);
                    }

                    insertToIndex -= offset.length();

                    replacementText = buildBottomReplacementText(placeholderContext, templateText, (Map<String, String>) chunksMap);
                }

                String releaseTextChunk = releaseText.substring(insertFromIndex, insertToIndex);
                releaseTextsChunks.add(releaseTextChunk);
                releaseTextsChunks.add(replacementText);
                insertFromIndex = insertToIndex;
            }
        }

        if(insertFromIndex < releaseText.length()) {
            releaseTextsChunks.add(releaseText.substring(insertFromIndex));

        }


        StringBuilder resultText = new StringBuilder();
        for(String chunk: releaseTextsChunks) {
            resultText.append(chunk);
        }

        return resultText.toString();
    }

    private InsertInfo getIndexToInsert(PlaceholderContext readerContext, ReleaseContext writerContext) throws Exception {
        ParserRuleContext writerParserRuleContext = writerContext.getParserRuleContext();
        InsertInfo insertInfo;
        InsertIndexCalculator calculator = null;

        if (writerParserRuleContext instanceof TrainingParser.LibraryDefinitionContext) {
            calculator = new LibraryScopeIndexCalculator(readerContext, writerContext);

        } else if(writerParserRuleContext instanceof TrainingParser.ClassDefinitionContext) {
            calculator = new ClassScopeIndexCalculator(readerContext, writerContext);

        } else if(writerParserRuleContext instanceof TrainingParser.FunctionBodyContext) {
            calculator = new FunctionBodyScopeIndexCalculator(readerContext, writerContext);

        } else if(writerParserRuleContext instanceof TrainingParser.SwitchStatementContext) {
            calculator = new SwitchScopeIndexCalculator(readerContext, writerContext);

        } else if(writerParserRuleContext instanceof TrainingParser.MapLiteralContext) {
            calculator = new MapScopeIndexCalculator(readerContext, writerContext);

        } else if(writerParserRuleContext instanceof TrainingParser.ListLiteralContext) {
            calculator = new ArrayScopeIndexCalculator(readerContext, writerContext);

        } else if(writerParserRuleContext instanceof TrainingParser.BlockContext) {
            calculator = new BlockScopeIndexCalculator(readerContext, writerContext);
        } else if(writerParserRuleContext instanceof TrainingParser.TypeListContext) {
            calculator = new TypeListScopeIndexCalculator(readerContext, writerContext);
        } else if(writerParserRuleContext instanceof TrainingParser.EnumTypeContext) {
            calculator = new EnumScopeIndexCalculator(readerContext, writerContext);
        }


        if(calculator == null) {
            insertInfo = new InsertInfo();
        } else {
            insertInfo = calculator.getIndexToInsert();
        }

        return insertInfo;
    }

    private String buildTopReplacementText(PlaceholderContext placeholderContext, String templateText, Map<String, String> chunksMap) throws Exception {
        if(!chunksMap.containsKey(placeholderContext.getName())) {
            throw new Exception("?????? ???????????? ???????????? ?????? "+ placeholderContext.getName());
        }
        String replacementText = chunksMap.get(placeholderContext.getName());
        String placeholderOffset = getTopPlaceholderOffset();
        String placeholderLineOffset = getPlaceholderLineOffset(templateText, placeholderContext);

        replacementText = addOffsetsForEachLine(replacementText, placeholderLineOffset);
        replacementText = placeholderOffset + placeholderLineOffset + replacementText;

        return replacementText;
    }

    private String buildBottomReplacementText(PlaceholderContext placeholderContext, String templateText, Map<String, String> chunksMap) throws Exception {
        if(!chunksMap.containsKey(placeholderContext.getName())) {
            throw new Exception("?????? ???????????? ???????????? ?????? "+ placeholderContext.getName());
        }
        String replacementText = chunksMap.get(placeholderContext.getName());
        String placeholderOffset = getBottomPlaceholderOffset();
        String placeholderLineOffset = getPlaceholderLineOffset(templateText, placeholderContext);

        // TODO check
        replacementText = addOffsetsForEachLine(replacementText, placeholderLineOffset);
        replacementText = placeholderLineOffset + replacementText + placeholderOffset;

        return replacementText;
    }

    private String addOffsetsForEachLine(String replacementText, String placeholderLineOffset) {
        if(placeholderLineOffset.length() == 0) {
            return replacementText;
        }

        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(replacementText);
        replacementText = matcher.replaceAll("\n" + placeholderLineOffset);

        return replacementText;
    }

    private String getPlaceholderLineOffset(String templateText, PlaceholderContext context) {
        String offsetPattern = "[ \r\t]*$";
        Token startToken = context.getParserRuleContext().getStart();
        String startText = templateText.substring(0, startToken.getStartIndex());
        Pattern pattern = Pattern.compile(offsetPattern);

        Matcher matcher = pattern.matcher(startText);

        String offset = "";
        if(matcher.find()) {
            offset = startText.substring(matcher.start(), matcher.end());
        }

        return offset;
    }

    private String getTopPlaceholderOffset() {
        return "\r\n";
    }

    private String getBottomPlaceholderOffset() {
        return "\r\n";
    }

    private void init() {
        placeholdersContextsStorage = createPlaceholdersContextsStorage(templateText);
        releaseContextsStorage = createReleaseContextsStorage(releaseText, placeholdersContextsStorage);
    }

    private PlaceholdersContextsStorage createPlaceholdersContextsStorage(String text){
        ParseTree tree = createParseTree(text);
        ReaderWalker visitor = new ReaderWalker();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(visitor, tree);

        return visitor.getContextsStorage();
    }

    private ReleaseContextsStorage createReleaseContextsStorage(String text, PlaceholdersContextsStorage placeholdersContextsStorage){
        ParseTree tree = createParseTree(text);
        WriterWalker visitor = new WriterWalker(placeholdersContextsStorage);

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(visitor, tree);

        return visitor.getContextsStorage();
    }

    private ParseTree createParseTree(String text) {
        TrainingLexer lexer = new TrainingLexer(CharStreams.fromString(text));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrainingParser parser = new TrainingParser(tokens);

        return parser.compilationUnit();
    }

    private List<String> getExistsPlaceholders() {
        List<String> existsPlaceholders = new ArrayList<>();
        Set<String> chunksKeys = chunksMap.keySet();

        for(String name: placeholdersContextsStorage.getPlaceholdersNames()) {
            if(chunksKeys.contains(name) && !existsPlaceholders.contains(name)) {
                existsPlaceholders.add(name);
            }
        }

        return existsPlaceholders;
    }
}
