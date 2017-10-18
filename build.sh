#!/bin/bash
rm -fr testfiles/*
cp testresources/* testfiles
mvn clean package
rm -fr testfiles/*
