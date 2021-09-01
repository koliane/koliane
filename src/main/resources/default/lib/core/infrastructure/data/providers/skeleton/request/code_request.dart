import 'base_request.dart';

class CodeRequest extends BaseRequest {
  String _code;

  CodeRequest(String code): _code = code;

  get code => _code;
}