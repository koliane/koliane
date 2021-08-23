import 'package:get_it/get_it.dart';

class DiBootstrap {
  static final GetIt _di = GetIt.instance;

  static void providersToAppInit() {

  }

  static void eventDispatcherToAppInit() {
    _di.registerSingleton<EventDispatcher>(EventDispatcher());
  }
}