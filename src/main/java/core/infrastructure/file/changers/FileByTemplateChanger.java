package core.infrastructure.file.changers;

import antlr.training.ReaderWalker;
import antlr.training.TrainingLexer;
import antlr.training.TrainingParser;
import antlr.training.WriterWalker;
import core.application.mappers.OptionsMapper;
import core.application.mappers.ScenarioImplInterface;
import core.application.mappers.ScenarioOptionsMapper;
import core.infrastructure.antlr.Placeholder;
import core.infrastructure.antlr.contexts.PlaceholderContext;
import core.infrastructure.antlr.contexts.PlaceholdersContextsStorage;
import core.infrastructure.antlr.contexts.ReleaseContext;
import core.infrastructure.antlr.contexts.ReleaseContextsStorage;
import core.infrastructure.file.changers.insert_index_calculators.ClassScopeCalculator;
import core.infrastructure.file.changers.insert_index_calculators.InsertInfo;
import core.infrastructure.helpers.PathHelper;
import core.infrastructure.helpers.ReplacementHelper;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileByTemplateChanger {
    protected final ScenarioImplInterface optionsMapper;
    protected final Path pathToProject;

    public FileByTemplateChanger(Path pathToProject, ScenarioImplInterface optionsMapper) {
        this.pathToProject = pathToProject;
        this.optionsMapper = optionsMapper;
    }

    public void change(String strRelativePath) throws Exception {
        Path relativePath = Paths.get(strRelativePath);
        Path absolutePathToProductFile = pathToProject.resolve(relativePath);
        Path templateDirectory = PathHelper.getDefaultTemplateDirectory();
        Path pathToTemplateFile = templateDirectory.resolve(relativePath);
        File templateFile = pathToTemplateFile.toFile();

        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет шаблона для файла: " + relativePath.toString());
        }

        String templateText = new String(Files.readAllBytes(pathToTemplateFile), StandardCharsets.UTF_8);

        HashMap<String, String> chunksMap = optionsMapper.getChunksMap(relativePath);
        if(chunksMap.isEmpty()) {
            System.out.println("Нет шаблонов-заменителей для файла "+ strRelativePath);
            return;
        }

//        ArrayList<String> existsPlaceholders = getExistsPlaceholders(templateText, chunksMap);
//        Set<String> chunksKeys = chunksMap.keySet();
//        if(existsPlaceholders.isEmpty()) {
//            System.out.println("В шаблоне " + relativePath + " не найдены ключи "+chunksKeys);
//            return;
//        }
//
//        System.out.println(existsPlaceholders);
//
//        for (String existsPlaceholder : existsPlaceholders) {
//            getMountPoint(templateText, existsPlaceholder, chunksMap.get("existsPlaceholder"));
//        }

        System.out.println("------------------------------------");

//        Path absolutePathToRelease = pathToProject.resolve(relativePath);
        Path absolutePathToRelease = templateDirectory.resolve(Paths.get("test2.dart"));

        File releaseFile = pathToTemplateFile.toFile();
        if(!releaseFile.exists()) {
            throw new NoSuchFileException("Нет файла для вывода результата: " + absolutePathToRelease);
        }
        String releaseText = new String(Files.readAllBytes(absolutePathToRelease), StandardCharsets.UTF_8);


        PlaceholdersContextsStorage placeholdersContextsStorage = createPlaceholdersContextsStorage(templateText);
        ArrayList<String> existsPlaceholders = getExistsPlaceholders(placeholdersContextsStorage, chunksMap);
        Set<String> chunksKeys = chunksMap.keySet();
        if(existsPlaceholders.isEmpty()) {
            System.out.println("В шаблоне " + relativePath + " не найдены ни один ключ из "+chunksKeys);
            return;
        }

        System.out.println(existsPlaceholders);



        ReleaseContextsStorage releaseContextsStorage = createReleaseContextsStorage(releaseText, placeholdersContextsStorage);
        String newReleaseText = getNewReleaseText(templateText, releaseText, releaseContextsStorage, chunksMap);



        System.out.println(newReleaseText);


    }

    private String getNewReleaseText(
            String templateText,
            String releaseText,
            ReleaseContextsStorage releaseContextsStorage,
            HashMap<String, String> chunksMap
    ) throws Exception {
        ArrayList<String> releaseTextsChunks = new ArrayList<>();

        int insertFromIndex = 0;

//        System.out.println("qqqq");
//        System.out.println(releaseContextsStorage.getContexts().size());
        for(ReleaseContext releaseContext: releaseContextsStorage.getContexts()) {
//            PlaceholderContext placeholderContext = releaseContext.getPlaceholderContext();
            //TODO
//            PlaceholderContext placeholderContext = releaseContext.getPlaceholderContext();
            ArrayList<PlaceholderContext> placeholdersContexts = releaseContext.getPlaceholdersContexts();
            for(PlaceholderContext placeholderContext: placeholdersContexts) {
//                String placeholderOffset = getPlaceholderOffset(templateText, placeholderContext);
//                String placeholderLineOffset = getPlaceholderLineOffset(templateText, placeholderContext);
//                String replacementText = chunksMap.get(placeholderContext.getName());
//                System.out.println(placeholderContext.getName());
//                replacementText = buildReplacementText(replacementText, placeholderOffset, placeholderLineOffset);
//                String replacementText = buildReplacementText(placeholderContext, templateText, chunksMap);

                InsertInfo insertInfo = getIndexToInsert(placeholderContext, releaseContext);
                int insertToIndex = insertInfo.getIndexToInsert();

                String replacementText;
//                String replacementText = insertInfo.isTopAttaching()
//                    ? buildTopReplacementText(placeholderContext, templateText, chunksMap)
//                    : buildBottomReplacementText(placeholderContext, templateText, chunksMap);

                if(insertInfo.isTopAttaching()) {
                    replacementText = buildTopReplacementText(placeholderContext, templateText, chunksMap);
                }else{
                    String beforeIndexText = releaseText.substring(insertFromIndex, insertToIndex);
                    Pattern pattern = Pattern.compile("\n([ \r\t]*?)$");
                    Matcher matcher = pattern.matcher(beforeIndexText);

                    String offset = "";
                    if(matcher.find()) {
                        offset = matcher.group(1);
                    }

                    insertToIndex -= offset.length();

                    replacementText = buildBottomReplacementText(placeholderContext, templateText, chunksMap);
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
//        Placeholder placeholder = readerContext.getPlaceholder();
//        ParserRuleContext readerParserRuleContext = readerContext.getParserRuleContext();
        ParserRuleContext writerParserRuleContext = writerContext.getParserRuleContext();
        InsertInfo insertInfo;
//        int indexToInsert;

        if (writerParserRuleContext instanceof TrainingParser.LibraryDefinitionContext) {
            ClassScopeCalculator classScopeCalculator = new ClassScopeCalculator(readerContext, writerContext);
            insertInfo = classScopeCalculator.getIndexToInsert();
        } else if(writerParserRuleContext instanceof TrainingParser.ClassDefinitionContext) {
            ClassScopeCalculator classScopeCalculator = new ClassScopeCalculator(readerContext, writerContext);
            insertInfo = classScopeCalculator.getIndexToInsert();
//            indexToInsert = classScopeCalculator.getIndexToInsert().getIndexToInsert();

        } else {
//            indexToInsert = writerParserRuleContext.getStart().getStopIndex() + 1;
            insertInfo = new InsertInfo();
        }



        return insertInfo;
    }

    private String buildTopReplacementText(PlaceholderContext placeholderContext, String templateText, HashMap<String, String> chunksMap) throws Exception {
        if(!chunksMap.containsKey(placeholderContext.getName())) {
            throw new Exception("Нет текста замены для "+ placeholderContext.getName());
        }
        String replacementText = chunksMap.get(placeholderContext.getName());
        String placeholderOffset = getTopPlaceholderOffset(templateText, placeholderContext);
        String placeholderLineOffset = getPlaceholderLineOffset(templateText, placeholderContext);

        addOffsetsForEachLine(replacementText, placeholderLineOffset);
//        replacementText = placeholderOffset + replacementText;
        replacementText = placeholderOffset + placeholderLineOffset + replacementText;
//        replacementText = placeholderOffset + replacementText + "\r\n";

        return replacementText;
    }

    private String buildBottomReplacementText(PlaceholderContext placeholderContext, String templateText, HashMap<String, String> chunksMap) throws Exception {
        if(!chunksMap.containsKey(placeholderContext.getName())) {
            throw new Exception("Нет текста замены для "+ placeholderContext.getName());
        }
        String replacementText = chunksMap.get(placeholderContext.getName());
        String placeholderOffset = getBottomPlaceholderOffset(templateText, placeholderContext);
        String placeholderLineOffset = getPlaceholderLineOffset(templateText, placeholderContext);

        addOffsetsForEachLine(replacementText, placeholderLineOffset);
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
        return getTopOffset("[ \r\t]*$", templateText, context);
    }


    private String getTopPlaceholderOffset(String templateText, PlaceholderContext context) {
        return "\r\n";
//        return getTopOffset("[ \r\n\t]*$", templateText, context);
    }


    private String getBottomPlaceholderOffset(String templateText, PlaceholderContext context) {
//        return getBottomOffset("^[ \r\n\t]*", templateText, context);
        return getBottomOffset("[ \r\n\t]*$", templateText, context);
    }



    private String getBottomOffset(String offsetPattern, String templateText, PlaceholderContext context) {
//        Token stopToken = context.getParserRuleContext().getStop();
//        String stopText = templateText.substring(stopToken.getStopIndex()+1);
//
//        ////////////////////////////////////////
//
//        Pattern shiftPattern = Pattern.compile("\n([ \r\t]*?)$");
//        Matcher shiftMatcher = shiftPattern.matcher(stopText);
//
//        String shiftOffset = "";
//        if(shiftMatcher.find()) {
//            shiftOffset = shiftMatcher.group(1);
//        }
//
//        if(shiftOffset.length() > 0) {
////            stopText = stopText.substring(0, shiftOffset.length() - 2);
//            stopText = stopText.substring(0, stopText.length() - shiftOffset.length());
//        }
//
//        ////////////////////////////////////////
//
//        Pattern pattern = Pattern.compile(offsetPattern);
//
//        Matcher matcher = pattern.matcher(stopText);
//
//        String offset = "";
//        if(matcher.find()) {
//            offset = stopText.substring(matcher.start(), matcher.end());
//        }

//        return offset;
        return "\r\n";
    }

    private String getTopOffset(String offsetPattern, String templateText, PlaceholderContext context) {
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




    protected ArrayList<String> getExistsPlaceholders(PlaceholdersContextsStorage placeholdersContextsStorage, HashMap<String, String> chunksMap) {
        ArrayList<String> existsPlaceholders = new ArrayList<>();
        Set<String> chunksKeys = chunksMap.keySet();

        for(String name: placeholdersContextsStorage.getPlaceholdersNames()) {
            if(chunksKeys.contains(name) && !existsPlaceholders.contains(name)) {
                existsPlaceholders.add(name);
            }
        }

        return existsPlaceholders;
    }

//    protected ArrayList<String> getExistsPlaceholders(String templateText, HashMap<String, String> chunksMap) {
//        ArrayList<String> existsPlaceholders = new ArrayList<String>();
//        Set<String> chunksKeys = chunksMap.keySet();
//
//        Pattern pattern = Pattern.compile("#-.+?-#");
//        Matcher matcher = pattern.matcher(templateText);
//        while (matcher.find()){
//            String placeholder = templateText.substring(matcher.start(), matcher.end());
//            String clearedPlaceholder = ReplacementHelper.getClearedPlaceholder(placeholder);
//            if(chunksKeys.contains(clearedPlaceholder) && !existsPlaceholders.contains(clearedPlaceholder)) {
//                existsPlaceholders.add(clearedPlaceholder);
//            }
//        }
//
//        return existsPlaceholders;
//    }
}
