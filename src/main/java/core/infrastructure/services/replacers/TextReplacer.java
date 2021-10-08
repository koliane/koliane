package core.infrastructure.services.replacers;

import core.infrastructure.helpers.placeholder.CodePlaceholderHelper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Map;

abstract public class TextReplacer extends BaseReplacer {
    protected final String templateText;
    protected final String releaseText;

    protected TextReplacer(
            Path absolutePathToRelease,
            Path absolutePathToTemplate,
            String chunksDirectoryPostfix,
            String commandName,
            Map<String, String> options
    ) throws IOException {
        super(absolutePathToRelease, absolutePathToTemplate, chunksDirectoryPostfix, commandName);


        String templateText = new String(Files.readAllBytes(absolutePathToTemplate), StandardCharsets.UTF_8);
        this.templateText = (new CodePlaceholderHelper()).replaceAllPlaceholders(templateText, options);

        this.releaseText = new String(Files.readAllBytes(absolutePathToRelease), StandardCharsets.UTF_8);
    }
}
