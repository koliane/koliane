import core.application.mappers.AddEntityOptionsMapper;
import core.infrastructure.file.changers.FileByTemplateChanger;
import core.infrastructure.helpers.ReplacementHelper;

import java.nio.file.Path;
import java.nio.file.Paths;


//long m = System.currentTimeMillis();
//System.out.println( (System.currentTimeMillis() - m));

public class Main {

    public static void main(String[] args) throws Exception {

        ReplacementHelper.getBeforePlaceholderText("Q#-uii-#zz0");
        ReplacementHelper.getAfterPlaceholderText("Q#-uii-#zz0");

        /*
        Path relativePath = Paths.get("test.dart");
        Path templateDirectory = PathHelper.getDefaultTemplateDirectory();
        Path pathToTemplateFile = templateDirectory.resolve(relativePath);
        File templateFile = pathToTemplateFile.toFile();

        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет шаблона для файла: " + relativePath.toString());
        }

        String templateText = new String(Files.readAllBytes(pathToTemplateFile), StandardCharsets.UTF_8);



        /////////////
        Path resultRelativePath = Paths.get("test2.dart");
        Path pathToResultFile = templateDirectory.resolve(resultRelativePath);
        File resultFile = pathToTemplateFile.toFile();
        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет файла для вывода результата: " + resultRelativePath.toString());
        }
        String resultText = new String(Files.readAllBytes(pathToResultFile), StandardCharsets.UTF_8);
        /////////////


//        System.out.println(templateText);
        System.out.println("-----------------------------------------------------------");

        TrainingLexer lexer = new TrainingLexer(CharStreams.fromString(templateText));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrainingParser parser = new TrainingParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        ReaderWalker templateVisitor = new ReaderWalker();
        walker.walk(templateVisitor, tree);

        PlaceholdersContextsStorage placeholdersContextsStorage = templateVisitor.getContextsStorage();

        ////////////////////////
        TrainingLexer resultLexer = new TrainingLexer(CharStreams.fromString(resultText));
        CommonTokenStream resultTokens = new CommonTokenStream(resultLexer);
        TrainingParser resultParser = new TrainingParser(resultTokens);
        ParseTree resultTree = resultParser.compilationUnit();
        ParseTreeWalker resultWalker = new ParseTreeWalker();
        WriterWalker resultVisitor = new WriterWalker(placeholdersContextsStorage);
        resultWalker.walk(resultVisitor, resultTree);

        ReleaseContextsStorage resultContextsStorage = resultVisitor.getContextsStorage();
        HashMap<String, String> placeholdersMap = new HashMap<>();
        placeholdersMap.put("FUNC_MOUNT_POINT", "print('zzz');");
        ////////////////////////


        ArrayList<PlaceholderContext> contexts = placeholdersContextsStorage.getContexts();
        PlaceholderContext firstContext = contexts.get(0);
        System.out.println("Main");
//        System.out.println(contexts.size());

//        ArrayList<Context> descendants = firstContext.getDescendants();
//        ArrayList<Context> nestedContexts = firstContext.getNestedContexts();
//        System.out.println(descendants.size());
//        System.out.println(nestedContexts.size());


//        System.out.println("template ids= "+firstContext.getNestedRulesIds());
        System.out.println("all template ids= "+firstContext.getAllContextsRulesIds());

        //////////////////////////////////
        ArrayList<ReleaseContext> releaseContexts = resultContextsStorage.getContexts();

        StringBuilder stringBuilder = new StringBuilder(resultText);
        for(ReleaseContext releaseContext: releaseContexts) {
            stringBuilder.insert(releaseContext.getParserRuleContext().getStart().getStartIndex()+1, "hello");
            System.out.println(stringBuilder.toString());
            System.out.println("all result ids= "+releaseContext.getAllContextsRulesIds());
        }



//        resultText.code
//        Context firstResultContext = resultContexts.get(0);
//        Context firstResultContext = resultVisitor.getCurrentContext();
//        System.out.println("result ids= "+firstResultContext.getNestedRulesIds());
        //////////////////////////////////
*/









        String strPathToFile = "D:/projects/java/koliane/src/main/resources/default/test.dart";
//        String strPathToOutputFile = "D:/projects/java/koliane/src/main/resources/test2.dart";
//
        Path pathToTemplateFile = Paths.get(strPathToFile).toAbsolutePath();

        Path relativePath = Paths.get("test.dart");
//        Path pathToProject = Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT);
        Path pathToProject = Paths.get("D:/projects/java/koliane/src/main/resources");

//        OptionsMapper optionsMapper = new OptionsMapper();
        AddEntityOptionsMapper optionsMapper = new AddEntityOptionsMapper("asdf", "Auth");
//        System.out.println(optionsMapper.getMap(pathToTemplateFile));

        FileByTemplateChanger fileByTemplateChanger = new FileByTemplateChanger(pathToProject, optionsMapper);
        fileByTemplateChanger.change("test.dart");



return;


/*
        try {


            CommandRequest commandRequest = new CommandRequest(args);
            Command command = commandRequest.getCommand();

//            InitAttributes attributes = new InitAttributes(new String[]{"--force"});
//            Command command = new InitCommand(Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT), attributes);
//            Command command = new InitCommand(Paths.get(Config.PATH_TO_PROGRAM_TEST_PROJECT));
//            Command command = new HelpCommand();

            for (int i = 0; i < args.length; i++){
                String arg = args[i];
                System.out.println(String.format("Argument %d: %s", i, arg));
            }

            if(command instanceof InitCommand) {
                Path projectDirectoryPath = command.getPathToProject();
                OptionsMapper optionsMapper = new OptionsMapper();
                String projectName = new PubspecYaml().getProjectName(projectDirectoryPath.toString());
                optionsMapper.setProjectName(projectName);

                DefaultInitializer initializer = new DefaultInitializer((InitCommand) command, optionsMapper);
                initializer.exec();
            } else if(command instanceof HelpCommand) {
                new HelpExecutor().exec();
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Скрипт прерван");
        }

*/
    }
}
