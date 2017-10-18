# build

    mvn clean package

# clean
Since tests modify some files, it is necessary to hard reset files after building. TODO: do not modify test files.

    git reset HEAD --hard

# usage

    mvn exec:java -Dexec.mainClass=org.xBaseJ.swing.dbfViewer
