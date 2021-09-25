import 'request/base_request.dart';

abstract class BaseProvider {
  const BaseProvider();

  Future send(covariant BaseRequest request);
}