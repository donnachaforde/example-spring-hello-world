# Readme: example-spring-hello-world (raw Java build)
An example of the classic "Hello World!" program in 'Spring style', as described in the _Pro Spring_ book from Apress. Consequently, this is a decoupled design, with externalized specification of the concrete classes that will ultimately be used. 

## Requirements
The code has one explicit library dependency on Spring Core, which in turn has a dependency on commons-logging:

*   spring-core-1.0.2.jar
*   commons-logging-1.2.jar

 

## IDE
An IntelliJ project file called _example-spring-hello-world_ is included in the root directory of the project. 

#### Notes:

*   You will need to tell IntelliJ which directories are the source directories so that the IDE recognizes the Java source files as part of the project. Use 'Project Structure' for this.
*	You will also need to it which SDK to use and where to put the build output files (./out is mentioned in the .gitignore file).
*   Use the IntelliJ Download Tool (Project Structure) to download copies of the dependency libraries to your local project directory structure. 
*	To run the project, you will need to add a 'Configuration'. The easiest way to do this is to select the HelloWorld.java file, right-click to pop up the menu and select 'Run'. It should then remember this run configuration.
 


## Building the project
You will need:

*   Java JDK 8 (or higher)

An IntelliJ project file is included in the repo, which can be view and build the project but Java is the only actual requirement to build the project.


