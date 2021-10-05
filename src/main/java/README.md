## Файл спецификации .yaml
*Плейсхолдеры* - места на шаблонной странице, которые будут заменены кодом.
Плейсхолдеры в пути начинаются и заканчиваются двойным нижним подчеркиванием `__`.  
Плейсхолдеры в коде начинаются с `#-` и заканчиваются `-#`  
Плейсхолдеры находятся только в шаблонном проекте


```
// Пример плейсхолдера в пути
...entities\__entity_name__\model\__entity_name__.dart_chunks\add_entity_method.yaml  

// Пример плейсхолдера в коде
newSuper#-entity_name-#Method() {
  print("#-PROJECT_NAME-#");
}

```
---
__Доступные параметры (поля, помеченные звездочкой являются обязательными):__
* `path_to_template_project`* - путь до проекта с шаблонами  
```
path_to_template_project: "D:/projects/java/koliane/src/main/resources/default/"
```
* `anchor_file_name` - Имя файла (или относительный путь от начала проекта), который позволяет понять, что программа будет выполняться с корректного места.  
Т.е., это такой опорный файл. В случае когда его нет, то выбрасывается исключение.  
Нужно для безопасности и уверенности того, что действия будут выполняться от ожидаемого места.  
Эту проверку можно отключить через параметр `check_anchor` = false в спецификации
```
anchor_file_name: pubspec.yaml
```
* `check_anchor` - флаг проверки существования опорного файла
```
check_anchor: true
```
* `chunks_directory_postfix` - постфикс в названии директории, где будут храниться файлы с отрывками кода, 
который будет внедряться в проект.  
Названия этих файлов должны совпадать с названием команды, при вызове которой они будут считаны.
Расширение и формат этих файлов - `.yaml`.  
Эта директория находится в шаблонном проекте.  
Само название директории начинается с имени файла с расширением, 
в который будут внедряться изменения, и завершается `chunks_directory_postfix` 
```
chunks_directory_postfix: _chunks
```
```
// Пример полного пути до такого файла
D:...\lib\core\domain\entities\__entity_name__\model\__entity_name__.dart_chunks\add_entity_method.yaml

// Примеры названия директории
__entity_name__.dart_chunks
auth.dart_chunks
```

* `help` - общая справочная информация. Может быть
  * строкой
  * массивом
  * справочником
```
help: [Добавить метод в определенный entity]
или
help: Добавить метод в определенный entity
или 
help: 
  item: Добавить метод в определенный entity
```

* `commands` - возможные команды. У каждой команды могут быть следующие поля:
  * `help` - справочная информация по команде. строка/массив/справочник
  * `create` - список относительных путей, которые будут созданы по шаблону
  * `update` - список относительных путей, в которые будет добавлен функционал по шаблону
  ```
  // Пример команды
  add_entity_method:
    help: Добавить метод в определенный entity
    create: [
      lib/core/domain/entities/__entity_name__/repository/__entity_name___repository.dart
    ],
    update: [
      lib/core/domain/entities/__entity_name__/model/__entity_name__.dart
    ]
  ```
  

