#!/bin/bash

javac -d target --module-path target --module-source-path simple-modules $(find simple-modules -name "*.java")
