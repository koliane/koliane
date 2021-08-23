import './di/di_bootstrap.dart';

class Bootstrap {
  void appInit() {
    DiBootstrap.eventDispatcherToAppInit();
    DiBootstrap.providersToAppInit();
  }
}