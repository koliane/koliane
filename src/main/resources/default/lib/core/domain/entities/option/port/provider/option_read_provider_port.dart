import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/base_provider.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/dto/code_value_dto.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/request/base_request.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/response/list_response.dart';

abstract class OptionReadProviderPort extends BaseProvider {
  Future<ListResponse<CodeValueDto>> read(covariant BaseRequest request);
}