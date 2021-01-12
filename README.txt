How to run and test the program:

1) src folder has a class ChangeDirectory.java that implements the cd command in a method changePath and also has a class ChangeDirectoryTest with automated unit tests for the program.

2) First navigate to the src folder from command prompt.

3) Then compile the ChangeDirectory.java class using:
     javac ChangeDirectory.java

4) Now you can run and test the program by:
     java ChangeDirectory *current path* *new path* and you will get the result printed on console.

     for ex: 
     java ChangeDirectory /abc/def ghi

     output:
     /abc/def/ghi

5) To run Junit test, navigate to the src folder from command prompt.
  Then do the following steps:
  a) javac -cp junit-4.12.jar;. ChangeDirectoryTest.java
  b) java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore ChangeDirectoryTest


 
