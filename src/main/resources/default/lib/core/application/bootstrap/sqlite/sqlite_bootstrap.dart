import 'package:#-PROJECT_NAME-#/core/infrastructure/data/clients/sqlite/orm/sqlite_orm.dart';

class SQLiteBootstrap {
  static Future<bool> connect() async {
    return await SqliteOrm.instance.openConnection();
  }
}