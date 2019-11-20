@echo on

set LIB_JARS=""
cd ..\lib
for %%i in (*) do (
set LIB_JARS=!LIB_JARS!;..\lib\%%i
)
echo !LIB_JARS!

cd ..
set START_JARS=""
for %%i in (*.jar) do (
set START_JARS=%%i
)
echo !START_JARS!

java -Xms64m -Xmx1024m -XX:MaxPermSize=64M -classpath ..\config;%LIB_JARS% -jar %START_JARS%

pause
