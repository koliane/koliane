package core.infrastructure.config;

public class Config {
    /**
     * Если true, то обязательно указывать команды в командной строке
     */
    public static final boolean STRICT_MODE = false;

    public static final String PROGRAM_NAME = "koliane";
//    public static final String CMD_CONSOLE_PATH_PARAM = "pwd";
//
//    public static final String CMD_CONSOLE_INIT_PARAM = "init";

    public static final String PATH_TO_PROGRAM_TEST_PROJECT = "D:/projects/java/koliane/test_project_dir";


    public static boolean isStrictMode() {
        return STRICT_MODE;
    }
}
