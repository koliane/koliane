class Scalar {
  static bool isScalar(dynamic value) {
    return
      value is String
      || value is bool
      || value is int
      || value is double
    ;
  }
}