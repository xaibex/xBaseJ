#!/bin/bash
./build.sh
mvn exec:java -DDBF.RESET=true -Dexec.mainClass=org.xBaseJ.swing.dbfViewer
