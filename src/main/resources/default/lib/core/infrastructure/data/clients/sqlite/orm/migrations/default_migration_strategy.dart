import 'package:moor_flutter/moor_flutter.dart';

import 'base_migration.dart';
import 'list/init_migration.dart';


class DefaultMigrationStrategy implements MigrationStrategy {

  Map<int, List<BaseMigration>> get migrationsMap => {
    2: [

    ]
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
    InitMigration().up();


  };

  @override
  OnUpgrade get onUpgrade => (Migrator migrator, int from, int to) async {
    if (from >= to) {
      return;
    }
    print('-------------------- ON_UPGRADE ------------------');


    Iterable<MapEntry<int, List<BaseMigration>>> migrationsMapEntries = migrationsMap.entries;

    for(MapEntry<int, List<BaseMigration>> migrationsMapEntry in migrationsMapEntries) {
      int version = migrationsMapEntry.key;
      if(version <= from || version > to) {
        continue;
      }

      List<BaseMigration> migrations = migrationsMapEntry.value;
      int n = migrations.length;

      for(int i = 0; i < n; i++) {
        BaseMigration migration = migrations[i];
        await migration.up();
      }
    }
  };

}