@ECHO OFF
@REM java -jar D:\projects\java\koliane\out\artifacts\jars\koliane.jar pd=%cd% sd=D:\projects\java\koliane\src\main\resources\default\spec.yaml %*
java -jar D:\projects\java\koliane\target\koliane-1.0-SNAPSHOT.jar ^
  pd=%cd% ^
  sd=D:\projects\java\koliane\src\main\resources\default\spec.yaml ^
  %*