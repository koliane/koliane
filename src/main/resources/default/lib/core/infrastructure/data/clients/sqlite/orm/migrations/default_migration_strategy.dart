import 'dart:io';

import './base_migration.dart';
import '../sqlite_orm.dart';
import 'package:moor_flutter/moor_flutter.dart';

class DefaultMigrationStrategy implements MigrationStrategy {

  Map<int, List<BaseMigration>> get migrationsMap => {

  };

  @override
  OnBeforeOpen? get beforeOpen => (details) async {
    print('-------------------- BEFORE_OPEN ------------------');
    if (details.wasCreated) {

    }
  };

  @override
  OnCreate get onCreate => (Migrator migrator) async {
    print('-------------------- ON_CREATE ------------------');
    await migrator.createAll();
  };

  @override
  OnUpgrade get onUpgrade => (Migrator migrator, int from, int to) async {
    if (from >= to) {
      return;
    }

    migrationsMap.forEach((version, migrations) => {
      if(version > from && version <= to) {
        migrations.forEach((migration) {
          migration.up();
        })
      }
    });
  };

}