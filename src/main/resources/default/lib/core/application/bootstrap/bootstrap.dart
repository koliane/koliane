import './di/di_bootstrap.dart';
import 'sqlite/sqlite_bootstrap.dart';

class Bootstrap {
  void appInit() {
    SQLiteBootstrap.connect();
    DiBootstrap.appStoreToAppInit();
    DiBootstrap.eventDispatcherToAppInit();
    DiBootstrap.providersToAppInit();
  }
}