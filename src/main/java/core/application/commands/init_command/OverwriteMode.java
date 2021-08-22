package core.application.commands.init_command;

public enum OverwriteMode {
    force, // Если файл уже существует, то он будет перезаписан
    soft, // Если файл уже существует, то он не будет тронут
    only_pubspec_force // pubspec.yaml будет перезаписан, а остальные существующие файлы тронуты не будут
}
