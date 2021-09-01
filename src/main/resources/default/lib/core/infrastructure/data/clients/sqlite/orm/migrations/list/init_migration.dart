import 'package:#-PROJECT_NAME-#/core/domain/entities/option/service/options_props.dart';

import '../../sqlite_orm.dart';
import '../../tables/option/option_dao.dart';

import '../base_migration.dart';

class InitMigration extends BaseMigration {
  @override
  Future up() async {
    OptionData data = OptionData(code: OptionsProps.need_to_show_onboarding_code, value: "1");
    await OptionDao().insertOption(data);
  }

}