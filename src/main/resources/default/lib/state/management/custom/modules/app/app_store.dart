import 'app_actions.dart';
import 'app_getters.dart';
import 'app_modules.dart';
import 'app_state.dart';
import '../../core/classes.dart';

class AppStore implements Store {
  @override
  AppActions? actions;

  @override
  AppGetters? getters;

  @override
  AppModules? modules;

  @override
  late AppState state;

  AppStore() {
    state = AppState();
    actions = AppActions(state);
  }

}