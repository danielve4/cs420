JC = javac
JR = java
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

default:
	echo Please chose an assignment

1:
	javac $(wildcard assignment1/app/*.java)
	java assignment1.app.VegaStoreApp

clean:
	rm $(wildcard */*.class)
