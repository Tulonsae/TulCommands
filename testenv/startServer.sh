#!/bin/sh

binDir=/Tul/TulCommands/devtest
cd $binDir
"/cygdrive/c/Program Files/Java/jdk1.7.0/bin/java.exe" -server -Xincgc -Xmx1G -jar craftbukkit.jar 2>&1 server.log
