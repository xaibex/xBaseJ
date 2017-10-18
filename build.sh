#!/bin/bash
rm -fr testfiles/*
cp testresources/* testfiles
mvn clean install
rm -fr testfiles/*
