import 'dart:math';
import 'dart:collection';

class Collection<T> extends ListBase<T>{
  final List<T> _data;
  int length;

  Collection([List<T>? data]):
        _data = data ?? [],
        length = data == null ? 0 : data.length
  ;

  T shift() => this._data.removeAt(0);

  void prepend(T value) => this._data.insert(0, value);


  Collection<T> slice(int offset, [int length = 0]) {
    List<T> sublist = length == 0
        ? this._data.sublist(offset)
        : this._data.sublist(offset, offset + length);

    return Collection(sublist);
  }

  Collection<T> forPage(int page, int perPage) {
    int offset = max(0, (page - 1) * perPage);
    return this.slice(offset, perPage);
  }

  @override
  T operator [](int index) {
    return _data[index];
  }

  @override
  void operator []=(int index, T value) {
    _data[index] = value;
  }
}