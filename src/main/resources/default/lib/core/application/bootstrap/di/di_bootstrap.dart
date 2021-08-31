import 'package:get_it/get_it.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/event_dispatching/event_dispatcher.dart';
import 'package:#-PROJECT_NAME-#/state/management/custom/modules/app/app_store.dart';

class DiBootstrap {
  static final GetIt _di = GetIt.instance;

  static void appStoreToAppInit() {
    _di.registerSingleton<AppStore>(AppStore());
  }

  static void providersToAppInit() {

  }

  static void eventDispatcherToAppInit() {
    _di.registerSingleton<EventDispatcher>(EventDispatcher());
  }
}