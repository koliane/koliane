package core.infrastructure.file;

import core.infrastructure.helpers.placeholder.FilePlaceholderHelper;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

abstract public class FileByTemplateAction {
    protected final Map<String, String> options;
    protected final Path pathToProject;
    protected final Path pathToTemplateProject;

    public FileByTemplateAction(Path pathToProject, Path pathToTemplateProject, Map <String, String> options) {
        this.pathToProject = pathToProject;
        this.pathToTemplateProject = pathToTemplateProject;
        this.options = options;
    }

    protected void validatePathWithPlaceholders(String relativePath) throws Exception {
        FilePlaceholderHelper filePlaceholderHelper = new FilePlaceholderHelper();
        List<String> placeholders = filePlaceholderHelper.getClearedPlaceholders(relativePath);

        for(String placeholder: placeholders) {
            if(options.get(placeholder) == null) {
                throw new Exception(
                    "Не найден заменитель для плейсхолдера "+ placeholder +" в пути " + relativePath
                );
            }
        }

    }
}
