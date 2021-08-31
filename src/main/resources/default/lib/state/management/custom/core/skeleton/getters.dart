import './state.dart';

abstract class Getters {
  covariant State _state;
  Getters(this._state);
}