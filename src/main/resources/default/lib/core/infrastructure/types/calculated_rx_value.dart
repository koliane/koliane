import 'dart:async';

import 'rx_value.dart';

typedef RxValueCalculator = Function(List<RxValue>);

class CalculatedRxValue<T> {
  final List<RxValue> _rxValues;
  final StreamController<T?> _controller;
  late List<StreamSubscription> _subscriptions;
  late final Stream _stream;
  late final RxValueCalculator _calculatorCallback;
  T? _value;


  CalculatedRxValue(this._rxValues, {
    initialData,
    RxValueCalculator? calculator
  }):
        _controller = StreamController.broadcast() {
    this._stream = _controller.stream;
    this._calculatorCallback = calculator == null
        ? (list){ return null; }
        : calculator
    ;

    _subscriptions = [];
    _rxValues.forEach(( rxValue) {
      StreamSubscription sub = rxValue.stream.listen((event) {
        _calculate();
      });
      _subscriptions.add(sub);
    });

    _value = initialData;
  }

  void _calculate() {
    T? calculatedValue = _calculatorCallback(_rxValues);

    if(_value == calculatedValue) {
      return;
    }

    value = calculatedValue;
  }

  T? get value => _value;
  set value(T? value) {
    if(value == _value) {
      return;
    }

    _value = value;
    update();
  }

  Stream get stream => _stream;

  void update() {
    _controller.add(value);
  }
}