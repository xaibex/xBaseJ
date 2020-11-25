del /F /Q testfiles\*
copy testresources\* testfiles
call mvn clean install
del /Q testfiles\*
type nul > testfiles\.gitkeep