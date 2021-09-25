package core.infrastructure.file.creators;

import core.application.mappers.OptionsMapper;
import core.infrastructure.helpers.PathHelper;
import core.infrastructure.helpers.ReplacementHelper;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class FileByTemplateCreator {
    protected final OptionsMapper optionsMapper;
    protected final Path pathToProject;

    public FileByTemplateCreator(Path pathToProject, OptionsMapper optionsMapper) {
        this.pathToProject = pathToProject;
        this.optionsMapper = optionsMapper;
    }

    public void forceCreate(String relativePath) throws Exception {
        create(relativePath, true);
    }

    public void softCreate(String relativePath) throws Exception {
        create(relativePath, false);
    }

    public void create(String relativePath, boolean isForced) throws Exception {
        Path absolutePathToCreate = pathToProject.resolve(relativePath);
        File file = absolutePathToCreate.toFile();
        boolean isPathToDirectory = isPathToDirectory(absolutePathToCreate);
        boolean isPathToFile = !isPathToDirectory;
        if(file.exists()) {
            String message = isPathToDirectory
                    ? "Директория уже существует: " + absolutePathToCreate
                    : "Файл уже существует: " + absolutePathToCreate;
            System.out.println(message);

            if(isPathToFile) {
                if(!isForced) {
                    return;
                }
                boolean deleteStatus = file.delete();
                String deleteMessage = deleteStatus
                        ? "Замещаемый файл удален: " + absolutePathToCreate
                        : "Не получилось удалить файл: " + absolutePathToCreate;
                System.out.println(deleteMessage);
            }

            if(isPathToDirectory) {
                return;
            }
        }

        createDirectories(absolutePathToCreate);

        if(isPathToDirectory) {
            return;
        }

        createFile(Paths.get(relativePath));
    }

    public boolean isPathToDirectory(Path path) {
        String fileName = path.getFileName().toString();

        return !fileName.contains(".");
    }

    protected void createDirectories(Path absolutePath) {
        Path pathToDirectory = isPathToDirectory(absolutePath)
                ? absolutePath
                : absolutePath.getParent();

        File directoryFile = pathToDirectory.toFile();
        boolean makeStatus = directoryFile.mkdirs();
        if(makeStatus) {
            System.out.println("Создана директория (и промежуточные): " + pathToDirectory);
        }
    }

    protected void createFile(Path relativePath) throws Exception {
        Path absolutePathToCreate = pathToProject.resolve(relativePath);
        Path templateDirectory = PathHelper.getDefaultTemplateDirectory();
        Path pathToTemplateFile = templateDirectory.resolve(relativePath);
        File templateFile = pathToTemplateFile.toFile();

        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет шаблона для файла: " + relativePath.toString());
        }

        String templateText = new String(Files.readAllBytes(pathToTemplateFile), StandardCharsets.UTF_8);

        HashMap<String, String> optionsMap = optionsMapper.getMap();
        for(HashMap.Entry<String, String> pair: optionsMap.entrySet()) {
            String key = pair.getKey();
            String optionValue = pair.getValue();

//            templateText = templateText.replaceAll("#-"+key+"-#", optionValue);
            String replacementWord = ReplacementHelper.getReplacementWord(key);
            templateText = templateText.replaceAll(replacementWord, optionValue);
        }

        Files.createFile(absolutePathToCreate);
        Files.write(absolutePathToCreate, templateText.getBytes(StandardCharsets.UTF_8));
        System.out.println("Создан файл: " + absolutePathToCreate.toString());
    }
}
