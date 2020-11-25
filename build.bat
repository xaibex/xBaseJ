cd testfiles
del /F /Q *
cd ..
copy testresources\* testfiles
mvn clean install
cd testfiles
del /F /Q *
