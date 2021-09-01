import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/base_provider.dart';
import 'package:#-PROJECT_NAME-#/core/infrastructure/data/providers/skeleton/request/code_value_request.dart';

abstract class OptionUpdateProviderPort extends BaseProvider {
  Future<bool> update(covariant CodeValueRequest request);
}