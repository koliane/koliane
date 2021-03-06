## Запуск
При изменении Java кода, для того, чтобы получить нормальный `.jar`, нужно выполнить команду `mvn install`  
При запуске программы, нужно передать минимум 3-и параметра:
* `pd` - путь до проекта, с которым работает программа
```
pd=%cd%
```
* `sd` - путь до спецификации
```
sd=D:\projects\flutter\template\spec.yaml
```
* Название команды
```
init
```

```
// Шаблонный пример вызова программы
java -jar #path_to_jar_file# pd=#path_to_project# sd=#path_to_specification_file# #command_name#

// Полноценный пример вызова программы из .bat файла
java -jar D:\projects\java\koliane\target\koliane-1.0-SNAPSHOT.jar ^
  pd=%cd% ^
  sd=D:\projects\flutter\template\spec.yaml ^
  %*
```

## Файл спецификации .yaml
### Плейсхолдеры
* *Плейсхолдеры* - места на шаблонной странице, которые будут заменены кодом.
* Плейсхолдеры в пути начинаются и заканчиваются двойным нижним подчеркиванием `__`.  
* Плейсхолдеры в коде начинаются с `#-` и заканчиваются `-#`  
* Плейсхолдеры находятся только в шаблонном проекте
* Плейсхолдеры, которые не являются точками монтирования, регистронезависимы


```
// Пример плейсхолдера в пути
...entities\__entity_name__\model\__entity_name__.dart_chunks\add_entity_method.yaml  

// Пример плейсхолдера в коде
newSuper#-entity_name-#Method() {
  print("#-PROJECT_NAME-#");
}

```
### Плейсхолдеры с флагами
У плейсхолдеров в коде можно указывать дополнительные флаги по видоизменению заменяемой опции.  
Случай, когда это может понадобиться: в консоли ме передаем опцию, например, 'Auth', но в некоторых местах кода
нам нужно, чтобы это слово начиналось с маленькой буквы, т.е. 'auth'.  
Для этого, мы видоизменяем плейсхолдер, как в примере ниже:
```
// Пример синтаксиса
#-entity_name|zzz=a,b,c-#

// Рабочие примеры
#-entity_name|snake-# // приведем опцию в snake_case формат
#-entity_name|uc-# // приведем опцию к верхнему регистру
#-entity_name|ul=first-# // приведем первый символ опции к нижнему регистру
```
Формат следующий:
* После названия опции ставим символ `|`
* После символа `|` пишем наши флаги
* Разные флаги отделяются точкой с запятой `;`
* Сам флаг может быть одним словом, так и комбинированным со своими параметрами
  * Эти параметры добавляются после символа `=`
  * Параметры разделяются запятой `,`

Реализованные на данный момент флаги:
* `uc` (регистр не важен) - привести опцию к верхнему регистру 
  * `first` - с этим параметром будет приведен к верхнему регистру только первый символ
* `lc` (регистр не важен) - привести опцию к нижнему регистру 
  * `first` - с этим параметром будет приведен к нижнему регистру только первый символ
* `snake` - привести опцию к `snake_case`

---
### Доступные параметры:
(поля, помеченные звездочкой являются обязательными)
* `path_to_template_project` - путь до проекта с шаблонами. Если не указан, то берется директория, 
в которой находится файл спецификации и проверяется наличие файла pubspec.yaml, чтобы точно понимать, 
что мы находимся в проекте flutter (пусть и шаблонном)
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

* `placeholders` - справочная информация о плейсхолдерах. Отображается при выполнении команды `help`
```
placeholders:
  PROJECT_NAME: название проекта, которое берется из pubspec.yaml
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

* `commands`* - возможные команды. У каждой команды могут быть следующие поля:
  * `help` - справочная информация по команде. строка/массив/справочник
  * `create_default_mode` - режим создания файлов по умолчанию (т.е. если не указано иное).
    Если этот параметр не указан, то по умолчанию берется режим `force`
    Возможные значения:
    * `soft` - если файл по указанному пути уже существует, то не выполняется никаких действий
    * `force` - если файла по указанному пути уже существует, то он замещается шаблонным.
    ```
    create_default_mode: force
    ```
  * `create` - список относительных путей, которые будут созданы по шаблону.  
    Если нужно указать режим замещения, то его мы указываем либо в одной строке с путем до файла
    либо в объекте, где ключ `path` - путь до файла, а ключ `mode` - режим замещения.
    ```
    lib/../...dart // указан только путь, поэтому режим берется по умолчанию
    
    soft lib/../...dart // в одной строке с путем указан режим замещения
    
    // Пример, где путь до файла описывается объектом
    {
      path: lib/../...dart
      mode: force
    }
    ```
     
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
  


