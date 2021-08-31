import 'dart:async';

import 'package:flutter/material.dart';

class RxValue<T> {
  final StreamController<T> _controller;
  late final Stream _stream;

  T _value;


  RxValue(T value):
        _value = value,
        _controller = StreamController.broadcast() {
    this._stream = _controller.stream;
  }


  T get value => _value;

  set value(T value) {
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