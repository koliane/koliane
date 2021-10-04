package core.infrastructure.file.creators;

import core.application.mappers.OptionsMapper;
import core.infrastructure.file.FileByTemplateAction;
import core.infrastructure.helpers.PathHelper;
import core.infrastructure.helpers.ReplacementHelper;
import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;
import core.infrastructure.helpers.placeholder.FilePlaceholderHelper;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileByTemplateCreator extends FileByTemplateAction {
    public FileByTemplateCreator(Path pathToProject, Path pathToTemplateProject, Map <String, String> options) {
        super(pathToProject, pathToTemplateProject, options);
    }

    public void forceCreate(String relativePath) throws Exception {
        create(relativePath, true);
    }

    public void softCreate(String relativePath) throws Exception {
        create(relativePath, false);
    }

    public void create(String relativePath, boolean isForced) throws Exception {
        String relativeProjectPath = relativePath;
        FilePlaceholderHelper filePlaceholderHelper = new FilePlaceholderHelper();
        if(filePlaceholderHelper.hasPlaceholder(relativePath)) {
            validatePathWithPlaceholders(relativePath);
            relativeProjectPath = filePlaceholderHelper.replaceAllPlaceholdersToSnakeCase(relativeProjectPath, options);
        }

        Path absolutePathToCreate = pathToProject.resolve(relativeProjectPath);
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

        createFile(Paths.get(relativeProjectPath), Paths.get(relativePath));
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

    protected void createFile(Path relativePath, Path relativeTemplatePath) throws Exception {
        Path absolutePathToCreate = pathToProject.resolve(relativePath);
        Path pathToTemplateFile = pathToTemplateProject.resolve(relativeTemplatePath);
        File templateFile = pathToTemplateFile.toFile();

        if(!templateFile.exists()) {
            throw new NoSuchFileException("Нет шаблона для файла: " + relativeTemplatePath);
        }

        String templateText = new String(Files.readAllBytes(pathToTemplateFile), StandardCharsets.UTF_8);
        CodePlaceholderHelper codePlaceholderHelper = new CodePlaceholderHelper();
        templateText = codePlaceholderHelper.replaceAllPlaceholders(templateText, options);
        templateText = codePlaceholderHelper.deleteUnusedPlaceholders(templateText, options);

        Files.createFile(absolutePathToCreate);
        Files.write(absolutePathToCreate, templateText.getBytes(StandardCharsets.UTF_8));
        System.out.println("Создан файл: " + absolutePathToCreate.toString());
    }
}
