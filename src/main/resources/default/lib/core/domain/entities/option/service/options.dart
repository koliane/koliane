import '../model/bool_option.dart';
import '../model/option.dart';
import '../service/option_service.dart';
import '../service/options_props.dart';
import '../../skeleton/collection/base_collection.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/utils/scalar/scalar.dart';

class Options {
  static Options instance = Options._internal();
  static Map<String, Option> _optionsMap = {};
  late bool _needToShowOnboarding;


  Options._internal();


  Future<void> init() async {
    BaseCollection<Option> collection = await OptionService().getAllOptions();
    collection.forEach((element) {
      String code = element.code;
      var value = element.value;
      _optionsMap[code] = element;

      switch(code) {
        case OptionsProps.need_to_show_onboarding_code:
          _needToShowOnboarding = value;
          break;
      }
    });
  }

  Future<bool> _setValue(String code, dynamic newValue) async {
    Option? option = _optionsMap[code];
    if(option == null) {
      return false;
    }
    var value = option.value;

    if(Scalar.isScalar(value) && value == newValue) {
      return true;
    }

    Option newOption = option is BoolOption
        ? BoolOption(code, newValue)
        : Option(code, newValue)
    ;

    bool status = await OptionService().updateOption(newOption);

    if(!status) {
      return false;
    }

    option.value = newValue;

    return true;
  }


  bool get needToShowOnboarding => _needToShowOnboarding;

  Future<bool> setNeedToShowOnboarding(bool value) async {
    bool updateStatus = await _setValue(OptionsProps.need_to_show_onboarding_code, value);
    if(!updateStatus) {
      return false;
    }

    _needToShowOnboarding = value;

    return true;
  }

}