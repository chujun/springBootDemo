#!/usr/bin/env bash
JAR_NAME=first-1.0-SNAPSHOT.jar
mvn clean package && java -jar target/$JAR_NAME
