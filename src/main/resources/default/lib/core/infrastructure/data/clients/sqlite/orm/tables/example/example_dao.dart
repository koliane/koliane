import '../../sqlite_orm.dart';
import './example.dart';
import 'package:moor_flutter/moor_flutter.dart';

part 'example_dao.g.dart';

@UseDao(tables: [Example])
class ExampleDao extends DatabaseAccessor<SqliteOrm> with _$ExampleDaoMixin {
  ExampleDao(SqliteOrm db) : super(db);

  Future<List<ExampleData>> getAllExamples() => select(example).get();
}