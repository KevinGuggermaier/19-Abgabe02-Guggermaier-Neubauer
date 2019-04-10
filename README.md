# 19-Abgabe02-Guggermaier-Neubauer

Project Overview:

    We created one Maven and one Ant project. Both projects are doing the same.
    A simple java project which prints out the given argument to console and also
    the number of characters from the given argument.
    We have implemented one class, which is the main class and it includes all the
    necessary methods.

    Package: at.fhj.iit

Main Class:

    Includes the main() and sayHello() method.
    Main Method:
      At the beginning we are creating an object from type Main. Then we check if there
      is a given argument or not. If there is an argument, then the method sayHello is called.

    SayHello Method:
      Prints the given parameter to the console and returns the size of the String.
      Parameter: String
      Return value: Integer

Maven Project:

    pom.xml:
      Includes all the necessary plugins to create a jar file automatically
      
      plugins:
        - Compiler: to compile the maven project
        - Jar: to build an executable jar file
        - Maven: to run the executable jar file
        - Site: maven site for documentation

Ant Project:

    build.xml:
      Includes all the necessary targets, to create a jar file automatically
      
      Dependencies:
        < init -> compile -> jar -> install -> run >
        < clean >
        
      Targets:
        - init: to create the build-ant folder
        - compile: to create the .class files
        - jar: to create the .jar file and the output folder
        - install: to create the lib folder and copy the .jar file from the output folder to the lib folder
        - run: to run the .jar file
        - clean: deletes the build-ant and output folder

    build.properties:
       to change the all the names which are not static. 
      
      Settings:  
        - ant.build: Folder name which includes the .class files 
        - ant.out: Folder name which includes the .jar file
        - ant.lib: Folder name which includes the .jar file and all the libraries   
        - ant.filename: name of the .jar file 
        - ant.args: command line arguments 
        - ant.main: main class  
        - ant.projectName: name of the project 
