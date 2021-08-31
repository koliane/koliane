import 'event.dart';
import 'event_listener.dart';
import 'one_type_events.dart';

class EventDispatcher {
  // Ключ - тип класса события
  Map<String, OneTypeEvents> _listenersMap = {  };

  void addListener(Type event, covariant EventListener listener) {
    String eventKey = event.toString();
    bool existsEventType =  _listenersMap.containsKey(eventKey);

    if(!existsEventType) {
      _listenersMap[eventKey] = OneTypeEvents();
    }
    _listenersMap[eventKey]!.addListener(listener);
  }

  // void removeListener(covariant Event event, covariant EventListener listener) {
  void removeListener(Type event, covariant EventListener listener) {
    String eventKey = event.toString();
    bool existsEventType =  _listenersMap.containsKey(eventKey);

    if(existsEventType) {
      _listenersMap[eventKey]!.removeListener(listener);
    }
  }

  void removeListenersByEventType<T>() {
    String key = T.toString();
    _listenersMap.remove(key);
  }

  void dispatch(Event event) {
    String eventKey = event.runtimeType.toString();
    bool existsEventType =  _listenersMap.containsKey(eventKey);

    if(!existsEventType) {
      return;
    }

    _listenersMap[eventKey]!.exec(event);
  }
}