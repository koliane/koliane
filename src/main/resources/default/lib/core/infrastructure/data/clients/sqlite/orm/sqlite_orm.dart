import 'dart:io';

import './migrations/default_migration_strategy.dart';
// import 'package:food_delivery/core/providers/sqlite/client/orm/tables/employee/employee_dao.dart';
import '../sqlite.dart';
import 'package:path_provider/path_provider.dart';
import './tables/tables.dart';
import 'package:moor_flutter/moor_flutter.dart';
import 'package:moor/ffi.dart';
import 'package:path/path.dart' as p;

part 'sqlite_orm.g.dart';

@UseMoor(
  tables: [
    Example
  ],
  daos: [
    ExampleDao
  ]
)
class SqliteOrm extends _$SqliteOrm {
  static LazyDatabase openConnection() {
    return LazyDatabase(() async {
      final folder = await getApplicationDocumentsDirectory();
      final file = File(p.join(folder.path, SQLite.dbFileName));

      return VmDatabase(file);


      // final newFile = File(p.join(folder.path, SQLite.dbFileName));
      //
      // if(file.existsSync()) {
      //   await file.delete();
      // }
      //
      // print(newFile);
      // return VmDatabase(newFile);
    });
  }


  SqliteOrm(): super(openConnection());

  int get schemaVersion => 1;

  @override
  MigrationStrategy get migration => DefaultMigrationStrategy();

}