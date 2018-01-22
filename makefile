JC = javac
JR = java
.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

default:
	echo Please chose an assignment

1:
	javac $(wildcard assignment1/*.java)
	java assignment1.VegaStoreApp

clean:
	rm $(wildcard */*.class)
