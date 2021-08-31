import 'dart:async';
import 'package:flutter/material.dart';


class MultiStreamBuilder<T> extends StatefulWidget {
  final List<Stream> _streams;
  final AsyncWidgetBuilder<T> builder;

  const MultiStreamBuilder({
    required List<Stream> streams,
    required this.builder,
    Key? key
  }) :
        _streams = streams,
        super(key: key);

  @override
  _MultiStreamBuilderState createState() => _MultiStreamBuilderState();
}


class _MultiStreamBuilderState extends State<MultiStreamBuilder> {
  late StreamController _controller;
  List<StreamSubscription> _subscriptions = [];


  @override
  void initState() {
    super.initState();

    _controller = StreamController();
    widget._streams.forEach((Stream stream) {
      _subscriptions.add(stream.listen(_pushAction));
    });
  }

  void _pushAction(event) {
    _controller.add(event);
  }

  @override
  void dispose() {
    _subscriptions.forEach((StreamSubscription subscription) {
      subscription.cancel();
    });
    _controller.close();
    super.dispose();
  }


  @override
  Widget build(BuildContext context) {
    return Container(
      child: StreamBuilder(
        stream: _controller.stream,
        builder: widget.builder
      ),
    );
  }
}
