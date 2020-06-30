#!/bin/bash

jlink --output customJre --module-path "/Library/Java/JavaVirtualMachines/adoptopenjdk-14.jdk/Contents/Home/jmods":target --add-modules main.app
