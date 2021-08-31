import './actions.dart';
import './getters.dart';
import './state.dart';
import './modules.dart';

abstract class Store {
  covariant late final State state;
  covariant Getters? getters;
  covariant Actions? actions;
  covariant Modules? modules;
}