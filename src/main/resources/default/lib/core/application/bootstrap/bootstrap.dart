import 'package:#-PROJECT_NAME-#/core/domain/entities/option/service/options.dart';

import './di/di_bootstrap.dart';
import 'sqlite/sqlite_bootstrap.dart';

class Bootstrap {
  static Future<void> appInit() async {

    SQLiteBootstrap.connect().then((value){
      Options.instance.init();
    });

    // SQLiteBootstrap.connect();
    DiBootstrap.appStoreToAppInit();
    DiBootstrap.eventDispatcherToAppInit();
    DiBootstrap.providersToAppInit();
    //TODO опции должны инициализироваться после инициализации БД и Провайдеров
    // Options.instance.init();
  }
}