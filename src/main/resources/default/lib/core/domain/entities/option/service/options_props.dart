class OptionsProps {
  static const String need_to_show_onboarding_code = 'need_to_show_onboarding';

  static const List<String> boolProps = [
    need_to_show_onboarding_code,
  ];

  static bool isBool(String code) {
    return boolProps.contains(code);
  }

}