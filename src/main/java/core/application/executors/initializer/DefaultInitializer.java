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

        "lib/core/domain/ports",
        "lib/core/domain/entities/skeleton/port",
        "lib/core/domain/entities/skeleton/collection/base_collection.dart",
        "lib/core/domain/entities/skeleton/model/base_model.dart",
        "lib/core/domain/entities/skeleton/repository/base_repository.dart",
        "lib/core/domain/entities/skeleton/repository/crud_repository.dart",
        "lib/core/domain/entities/skeleton/event/base_event.dart",
//        "lib/core/domain/entities/skeleton/event/base_entity.dart",


        "lib/core/application/bootstrap/di/di_bootstrap.dart",
        "lib/core/application/bootstrap/di/sqlite_bootstrap.dart",
        "lib/core/application/bootstrap/bootstrap.dart",
        "lib/core/application/event_listeners/entities",
        "lib/core/application/use_cases",
        "lib/core/application/env/env.dart",
        "lib/core/application/env/env_enum.dart",
        "lib/core/application/env/config.dart",
        "lib/core/application/env/dev/dev_config.dart",
        "lib/core/application/env/prod/prod_config.dart",


//        "lib/core/infrastructure/structures/collection/collection.dart",
        "lib/core/infrastructure/types/collection.dart",
        "lib/core/infrastructure/types/rx_value.dart",
        "lib/core/infrastructure/types/calculated_rx_value.dart",

        "lib/core/infrastructure/di/di.dart",
        "lib/core/infrastructure/di/provider_di.dart",

        "lib/core/infrastructure/event_dispatching/event.dart",
        "lib/core/infrastructure/event_dispatching/event_dispatcher.dart",
        "lib/core/infrastructure/event_dispatching/event_listener.dart",
        "lib/core/infrastructure/event_dispatching/callback_event_listener.dart",
        "lib/core/infrastructure/event_dispatching/one_type_events.dart",

        "lib/core/infrastructure/data/clients/skeleton/base_client.dart",
        "lib/core/infrastructure/data/clients/api",
        "lib/core/infrastructure/data/clients/example",
        "lib/core/infrastructure/data/clients/sqlite/sqlite.dart",
        "lib/core/infrastructure/data/clients/sqlite/sqlite_client.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/migrations/base_migration.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/migrations/default_migration_strategy.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/migrations/list/init_migration.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/tables.dart",

        "lib/core/infrastructure/data/clients/sqlite/orm/sqlite_orm.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/example/example.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/example/example_dao.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/option/option.dart",
        "lib/core/infrastructure/data/clients/sqlite/orm/tables/option/option_dao.dart",

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


//        "lib/state/management/bloc",
//        "lib/state/management/custom/core/rx_values/rx_value.dart",
//        "lib/state/management/custom/core/rx_values/calculated_rx_value.dart",
        "lib/state/management/custom/core/skeleton/actions.dart",
        "lib/state/management/custom/core/skeleton/getters.dart",
        "lib/state/management/custom/core/skeleton/state.dart",
        "lib/state/management/custom/core/skeleton/modules.dart",
        "lib/state/management/custom/core/skeleton/store.dart",
//        "lib/state/management/custom/core/ui/multi_stream_builder.dart",
        "lib/state/management/custom/core/classes.dart",
        "lib/state/management/custom/modules/app/app_actions.dart",
        "lib/state/management/custom/modules/app/app_getters.dart",
        "lib/state/management/custom/modules/app/app_modules.dart",
        "lib/state/management/custom/modules/app/app_state.dart",
        "lib/state/management/custom/modules/app/app_store.dart",
        "lib/state/routes/routes.dart",


        "lib/ui/widgets/service/multi_stream_builder.dart",
        "lib/ui/widgets/base/template",
        "lib/ui/widgets/base/wrapper",
        "lib/ui/widgets/components/template",
        "lib/ui/widgets/components/wrapper",
        "lib/ui/widgets/scenes/template",
        "lib/ui/widgets/scenes/wrapper",
        "lib/ui/widgets/pages/template",
        "lib/ui/widgets/pages/wrapper",
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
