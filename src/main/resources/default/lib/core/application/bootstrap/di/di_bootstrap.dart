import 'package:get_it/get_it.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/event_dispatching/event_dispatcher.dart';
import 'package:#-PROJECT_NAME-#/state/management/custom/modules/app/app_store.dart';
import 'package:#-PROJECT_NAME-#/core/domain/entities/option/port/provider/option_read_provider_port.dart';
import 'package:#-PROJECT_NAME-#/core/domain/entities/option/port/provider/option_update_provider_port.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/entities/option/provider/sqlite/option_crud_provider.dart';

class DiBootstrap {
  static final GetIt _di = GetIt.instance;

  static void appStoreToAppInit() {
    _di.registerSingleton<AppStore>(AppStore());
  }

  static void providersToAppInit() {
    _di.registerLazySingleton<OptionReadProviderPort>(() => const OptionCrudProvider.read());
    _di.registerLazySingleton<OptionUpdateProviderPort>(() => const OptionCrudProvider.update());
  }

  static void eventDispatcherToAppInit() {
    _di.registerSingleton<EventDispatcher>(EventDispatcher());
  }
}