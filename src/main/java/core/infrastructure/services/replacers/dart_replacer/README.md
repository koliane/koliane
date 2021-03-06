### Правила расположения плейсхолдеров

* В конструкции `switch`, для вставки конструкции case, плейсхолдер нужно располагать сверху, под самим switch. 
Т.е., после открытия скобки.  

```
// Пример: 
switch(word) {    
  #-PLACEHOLDER_NAME-#    
}   
``` 
Для `Map` и `List` после плейсхолдера ОБЯЗАТЕЛЬНО должна стоять запятая, если после него еще идут элементы. 
Также запятая должна стоять после выражения, после которого идет плейсхолдер
```
Map zzz = {
  "hello": "world",
  #-MOUNT_POINT-#
};

List abc = [
  #-MOUNT_POINT-#,
  "hello"
];
```

### Порядок добавления нового обработчика scope
* Создать новый класс, наследник от `InsertIndexCalculator`. Чаще всего, это наследник от `ScopeIndexCalculator`
* В класс `BaseWalker` в св-ва `contextRules` и `checkNameRules` добавить класс, созданный выше
* В класс `DartReplacer`, в метод `getIndexToInsert`, добавить соответствующее условие
* В класс `NameGetter` добавить функционал определения уникального имени для созданного scope.
Если в `NameGetter` используется функционал из `IdentifierGetter`, то в метод `get` добавить соответствующий функционал
* Если новый scope является `block`, то нужно добавить в класс `BaseWalker` в св-во `availableBlockContexts` соответствующий класс
и добавить в класс `NameGetter`, в метод `fromBlock` соответствующий обработчик
