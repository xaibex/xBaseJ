# build without tests

    ./build.sh

# build with tests

    mvn clean package

# clean after building with tests
Since tests modify some files, it is necessary to hard reset files after building. TODO: do not modify test files.

    git reset HEAD --hard

# usage

    ./run.sh
