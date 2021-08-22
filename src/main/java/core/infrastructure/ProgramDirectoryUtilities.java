package core.infrastructure;
import core.infrastructure.config.Config;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ProgramDirectoryUtilities
{

    public static String getProgramDirectory() throws Exception
    {
        String str = ProgramDirectoryUtilities.class.getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath();
        str = str.replaceAll("^[\\/]", "");

        return calculatedRoot(str);
    }

    private static String calculatedRoot(String strPath) throws Exception{
        Path path = Paths.get(strPath).toAbsolutePath();

        if(path.getRoot().toString().equals(path.toString())) {
            throw new Exception("Не удалось обнаружить корень проекта");
        }

        if(path.getFileName().toString().equals(Config.PROGRAM_NAME)) {
            return path.toString();
        }

        return calculatedRoot(path.getParent().toString());
    }
}