package core.application.executors.initializer;

import core.application.OptionsMapper;
import core.application.commands.init_command.InitCommand;
import core.infrastructure.config.Params;
import core.infrastructure.file_creators.FileByTemplateCreator;

public class DefaultInitializer extends BaseInitializer {
    private static final String pathToPubspec = "pubspec.yaml";

    private static final String paths[] = {
//        "pubspec.yaml",
        pathToPubspec,

        "lib/core/domain/entities/skeleton/collection/base_collection.dart",
        "lib/core/domain/entities/skeleton/model/base_model.dart",
        "lib/core/domain/entities/skeleton/repository/base_repository.dart",
        "lib/core/domain/entities/skeleton/repository/crud_repository.dart",


        "lib/core/application/bootstrap",


        "lib/core/infrastructure/structures/collection/collection.dart",
        "lib/core/infrastructure/di/di.dart",

        "lib/core/infrastructure/data/clients/skeleton/base_client.dart",
        "lib/core/infrastructure/data/clients/api",
        "lib/core/infrastructure/data/clients/example",
        "lib/core/infrastructure/data/clients/sqlite/sqlite.dart",
        "lib/core/infrastructure/data/clients/sqlite/sqlite_client.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/migrations/base_migration.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/migrations/default_migration_strategy.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/migrations/list",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/tables.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/example/example.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/example/example_dao.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/sqlite_orm.dart",

        "lib/core/infrastructure/data/providers/entities",
        "lib/core/infrastructure/data/providers/skeleton/dto/base_dto.dart",
        "lib/core/infrastructure/data/providers/skeleton/providers/base_provider.dart",
        "lib/core/infrastructure/data/providers/skeleton/requests/base_request.dart",
        "lib/core/infrastructure/data/providers/skeleton/responses/base_response.dart",

        "lib/core/infrastructure/utils/datetime",
        "lib/core/infrastructure/utils/text",
        "lib/core/infrastructure/enums/crud_enum.dart",
        "lib/core/infrastructure/value_objects/name_code.dart",
        "lib/core/infrastructure/value_objects/value_code.dart",
        "lib/core/infrastructure/value_objects/value_name_code.dart",
        "lib/core/infrastructure/value_objects/process_status/loading_process_status.dart",
        "lib/core/infrastructure/value_objects/process_status/loading_status_enum.dart",
        "lib/core/infrastructure/value_objects/process_status/process_status.dart",


        "lib/state/management/bloc",
        "lib/state/routes/routes.dart",


        "lib/ui/base/template",
        "lib/ui/base/release",
        "lib/ui/components/template",
        "lib/ui/components/release",
        "lib/ui/scenes/template",
        "lib/ui/scenes/release",
        "lib/ui/pages/template",
        "lib/ui/pages/release",
        "lib/ui/styles/default/color.dart",
        "lib/ui/styles/default/theme.dart",

    };

    public static String help() {
        return Params.INIT_COMMAND
                + " - команда инициализации проекта\r\n"
                + "\t" + Params.INIT_COMMAND_FORCE_MODE_PARAM
                + " - Если файл уже существует, то он будет перезаписан\r\n"
                + "\t" + Params.INIT_COMMAND_SOFT_MODE_PARAM
                + " - Если файл уже существует, то он не будет тронут\r\n"
                + "\t" + Params.INIT_COMMAND_ONLY_PUBSPEC_FORCE_MODE_PARAM
                + " - pubspec.yaml будет перезаписан, а остальные существующие файлы тронуты не будут\r\n"
        ;
    }

    private final InitCommand command;

    public DefaultInitializer(InitCommand command, OptionsMapper optionsMapper) {
        super(command.getPathToProject(), optionsMapper);
        this.command = command;
    }

    private boolean init() throws Exception {
        FileByTemplateCreator fileByTemplateCreator = new FileByTemplateCreator(pathToProject, optionsMapper);
        boolean isForce = command.isForceMode();
        boolean isOnlyPubspecForceMode = command.isOnlyPubspecForceMode();

        int n = paths.length;
        for(int i=0; i < n; i++) {
            String strPath = paths[i];
            if(isForce || isOnlyPubspecForceMode && strPath.equals(pathToPubspec)) {
                fileByTemplateCreator.forceCreate(strPath);
            } else {
                fileByTemplateCreator.softCreate(strPath);

            }
        }
        return true;
    }

    @Override
    public void exec() throws Exception {
        init();
    }
}
