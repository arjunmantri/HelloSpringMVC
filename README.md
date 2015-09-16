# HelloSpringMVC
CMPE 275 
Lab 0 - Spring Hello World
Name - Arjun Mantri
Student ID - 009312706

interface Greeter {
	void setNames(List<String> names); // names of the authors
	String getGreeting();
  }

The value of the names property should be specified in beans.xml as well. 

After instantiating the application context, get the greeting bean by its ID, call its getGreeting() method to get the greeting message, and print it on the console.

If the author is Alice, the greeting message should be “Hello world from Alice!” 

Instructions to write a Hello World program using Spring framework:-
--------------------------------------------------------------------
Eclipse was used to write this program and to run it.
1.To write a Hello World program in Java using Spring framework, Java should be installed on your system.

2.we need to create a new "Java Project" or "Dynamic Web Project" in Eclipse.

3.Create a package named "com.lab.spring.helloworld" under src folder in project.

4. Download spring-framework-4.0.4.RELEASE from "http://olex.openlogic.com/packages/spring/4.0.2#package_detail_tabs".
This zip file contains all the jars to run programs written using Spring framework. Also download a commons-logging-1.2.jar
helps to execute program wittern in Spring.

5.If you have created a Java Project then create user libery with all jar files mentioned above and add that liberary
to the project.

6.If you have created Dynamic Web Project add all these jar files from libs folder of spring-framework-4.0.4.RELEASE
to project in Eclipse.
We need to copy these jar files to lib folder which is found under web Content/WEB-INF.

7.Create an Interface "Greeter", a class "Greeting" which implements the interface Greeter and one more class with name 
"GreetingMainApp"(contains main method). Along with these classes and interface we need to create an beans.xml file under
src folder.

8.Greeter interface contains two methods which we need to implement in Greeting class. One method set names of author and
another method returns a string having names of author.

9.In Spring framework Dependency Injection is used to remove or reduce dependency so that one class is not dependent on another.

10.To implement this we have written beans.xml where beans are created with id and class attributes and properties are defined.
The attribute "class" points to class "Greeting" and here values are injected to methods. Basically beans.xml file is used as a
configuration file.

11. In GreetinMainApp ApplicationContext is used which is a central interface within a Spring application for providing 
configuration information to the application.

12.Using bean id, name value of property is accessed in provided class.

13.Finally run the program as Java Application. The result will be displayed on console that is 
"Hello world from Alice".
