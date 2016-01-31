@echo off

echo [INFO] Install common.
cd %~dp0
cd ../common
call mvn clean install -pl .  -Dmaven.test.skip=true

cd ../bin
pause