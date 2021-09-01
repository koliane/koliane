import '../model/bool_option.dart';
import '../model/option.dart';
import '../port/provider/option_read_provider_port.dart';
import '../port/provider/option_update_provider_port.dart';
import '../service/options_props.dart';
import '../../skeleton/collection/base_collection.dart';
import '../../skeleton/model/base_model.dart';
import '../../skeleton/repository/base_repository.dart';
import '../../skeleton/repository/crud_repository.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/dto/code_value_dto.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/request/base_request.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/request/code_value_request.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/response/list_response.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/di/provider_di.dart';

class OptionRepository extends BaseRepository implements CrudRepository<Option> {
  const OptionRepository();

  @override
  Future<int> create(BaseModel model) {
    // TODO: implement create
    throw UnimplementedError();
  }

  @override
  Future delete(String id) {
    // TODO: implement delete
    throw UnimplementedError();
  }

  @override
  Future<BaseCollection<Option>> read() async {
    OptionReadProviderPort provider = ProviderDi.getOptionReadProvider();
    ListResponse<CodeValueDto> response = await provider.send(BaseRequest());

    BaseCollection<Option> collection = BaseCollection<Option>();
    response.list.forEach((element) {
      String code = element.code;
      Option option;
      if(OptionsProps.isBool(code)) {
        option = BoolOption(code, element.value == "1" ? true : false);
      } else {
        option = Option(element.code, element.value);
      }

      collection.add(option);
    });

    return collection;
  }

  @override
  Future<bool> update(covariant Option model) async {
    OptionUpdateProviderPort provider = ProviderDi.getOptionUpdateProvider();
    String value;
    if(model is BoolOption) {
      value = model.value ? "1" : "0";
    } else {
      value = model.value;
    }

    CodeValueRequest request = CodeValueRequest(model.code, value);

    return await provider.send(request);
  }

}