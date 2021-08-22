import 'package:moor_flutter/moor_flutter.dart';

class Example extends Table {
  @override
  String get tableName => 'examples';

  IntColumn get id => integer().autoIncrement()();
  TextColumn get name => text()();
  TextColumn get surname => text()();
  TextColumn get patronymic => text()();
  DateTimeColumn get birthdate => dateTime()();
  TextColumn get position => text()();
}