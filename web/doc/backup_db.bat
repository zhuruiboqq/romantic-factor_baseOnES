echo 取日期、时间变量值
set yy=%date:~0,4%

set mm=%date:~5,2%

set dd=%date:~8,2%

if /i %time:~0,2% lss 10 set hh=0%time:~1,1%

if /i %time:~0,2% geq 10 set hh=%time:~0,2%

set mn=%time:~3,2%

set ss=%time:~6,2%

set dateVar=%yy%%mm%%dd%

set timeVar=%hh%%mn%%ss%
set filename=%dateVar%_%timeVar%


 "D:/mysql-5.6.24-winx64/bin/mysqldump.exe" -uroot -prf_root_1926_Admin_!!! --opt --default-character-set=utf8 -e --triggers -R --hex-blob --flush-logs -x es > "D:/Backup/mysql/es_%filename%.sql"


"D:/mysql-5.6.24-winx64/bin/mysqldump.exe" -uroot -prf_root_1926_Admin_!!! --opt --default-character-set=utf8 -e --triggers -R --hex-blob --flush-logs -x romantic > "D:/Backup/mysql/romantic_%filename%.sql"

 echo 导出已经完成

#pause
