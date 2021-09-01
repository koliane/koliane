import 'package:#-PROJECT_NAME-#/core/domain/entities/option/port/provider/option_read_provider_port.dart';
import 'package:#-PROJECT_NAME-#/core/domain/entities/option/port/provider/option_update_provider_port.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/clients/sqlite/orm/sqlite_orm.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/clients/sqlite/sqlite_client.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/dto/code_value_dto.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/request/code_value_request.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/response/list_response.dart';

import '../../../../skeleton/crud_provider.dart';
import '../../../../skeleton/request/base_request.dart';

class OptionCrudProvider extends CrudProvider
    implements OptionReadProviderPort, OptionUpdateProviderPort
{
  const OptionCrudProvider.create() : super.create();
  const OptionCrudProvider.read() : super.read();
  const OptionCrudProvider.update() : super.update();
  const OptionCrudProvider.delete() : super.delete();

  @override
  Future create(covariant BaseRequest request) {
    // TODO: implement create
    throw UnimplementedError();
  }

  @override
  Future delete(covariant BaseRequest request) {
    // TODO: implement delete
    throw UnimplementedError();
  }

  @override
  Future<ListResponse<CodeValueDto>> read(covariant BaseRequest request) async {
    List<OptionData> optionDataList = await SqliteClient.getOptions();
    List<CodeValueDto> resultList = [];
    optionDataList.forEach((element) {
      CodeValueDto model = CodeValueDto(element.code, element.value);
      resultList.add(model);
    });

    return ListResponse(resultList);
  }

  @override
  Future<bool> update(CodeValueRequest request) async {
    return await SqliteClient.updateOption(request.code, request.value);
  }

}