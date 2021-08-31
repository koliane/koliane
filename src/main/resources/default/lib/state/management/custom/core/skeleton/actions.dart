import './state.dart';

abstract class Actions {
  covariant State state;
  Actions(this.state);
}