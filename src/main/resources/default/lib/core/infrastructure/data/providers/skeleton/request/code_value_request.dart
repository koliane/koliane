import 'base_request.dart';

class CodeValueRequest extends BaseRequest {
  String _code;
  String _value;

  CodeValueRequest(String code, String value): _code = code, _value = value;

  get code => _code;
  get value => _value;
}