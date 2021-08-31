import 'package:moor_flutter/moor_flutter.dart';
import '../../sqlite_orm.dart';
import 'option.dart';

part 'option_dao.g.dart';

@UseDao(tables: [Option])
class OptionDao extends DatabaseAccessor<SqliteOrm> with _$OptionDaoMixin {
  static SqliteOrm _attachedDatabase = SqliteOrm.instance;
  OptionDao([SqliteOrm? forCompatibility]): super(_attachedDatabase);

  static const need_to_show_onboarding_code = 'need_to_show_onboarding';

  Future<List<OptionData>> getAllEmployee() => select(option).get();
  Future insertOption(OptionData optionItem) => into(option).insert(optionItem);
  Future updateOption(OptionData optionItem) => update(option).replace(optionItem);
}