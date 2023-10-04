### Core Java Basics
------------------
1. Java coding is different from python, where java have the compiler called javac where initially before we execute the code we need to compile the code using javac and later we will get the ".class" files where we can use the JVM and run the compiled code where we can simply call the java followed by class name without .class extension (Note: this java class should have the mail method in the code else it wont compile nor run.)
2. I have learned the java from Telusko channel where I did have some idea how java works since am a solution architect working from past 4 years in software industry, here is the link to the video [Telusko Youtube Link Java-v17](https://youtu.be/BGTx91t8q50)
3. Data types in java are two kinds they are primitive and non primitive data types where primitive data type are the building blocks of the non primitive data types. for this point lets see all the primitive data types available in java are as following.
    * byte - its of 1 byte size and stores valued from -127 to 127 if the value exceeds and we can force in program to this data type using (byte) infront of operation.
    * short - its of 2 bytes of size where the range is from -32768 to 32767.
    * int - its of 4 bytes size and the range is from -2147483648 to 2147483647
    * long - its of 8 bytes size and range is from -9223372036854775808 to 9223372036854775807, Note we have to specifiy the letter 'l' at the end of long value if we are using the long data type as during variable declaration.
    * float - its of 4 bytes of size and can store sufficiently 6 to 7 decimal digits and Note we need to mention 'f' at the end of the float value.
    * double - its of 8 bytes of size and can store sufficiently 15 decimal digits Note its the default precision holder so be careful to type cast to float if you are running out of memory.
    * char - its of 2 bytes size and follows UNIQUE code pattern of ASCII pattern.
    * boolean -  its of 1 bit either true or false Note java doesnt consider 0 and 1 as booleans.
4. Type casting is when you assign a value of one primitive data type to another type. In Java, there are two types of casting:
    * Widening Casting (automatically) - converting a smaller type to a larger type size == byte -> short -> char -> int -> long -> float -> double
    * Narrowing Casting (manually) - converting a larger type to a smaller size type == double -> float -> long -> int -> char -> short -> byte
5. operators - these are same as python except the logical operators where we have to write twice for example ```x>y && x==y```
6. condtional statements - basic if else thingy as in python for syntax check the [Link for syntax of conditional operators](https://www.w3schools.com/java/java_conditions.asp)
7. switch case statements - java have special thing called switch case statement [Link for syntax of switch case statement](https://www.w3schools.com/java/java_switch.asp), Note we have to use break else once a case is satisfied it will execute the rest all following cases.
8. while and do while [Link for the syntax](https://www.w3schools.com/java/java_while_loop.asp) Note that do while is used to execute the statement block atleast once.
9. for loop : [Link for syntax of for loop](https://www.w3schools.com/java/java_for_loop.asp).


### keywords of java collected so far and there definations
-----------------------
* for
* if
* else
* continue
* break
* public
* protected
* private
* package
* class
* 
[Link to all keywords available in java](https://www.geeksforgeeks.org/list-of-all-java-keywords/)

### Some miscellenous links for reference
--------------------
1. [markdown cheatsheet link](https://www.markdownguide.org/cheat-sheet/)
2. [presentation using JS](https://revealjs.com/)
3. [Java Cheat sheet Jv11](https://introcs.cs.princeton.edu/java/11cheatsheet/)
4. [JAR vs WAR vs EAR](https://medium.com/@ravi29shekhar/what-is-basically-jar-war-ear-file-in-java-b7beeb51bebb#:~:text=The%20.-,jar%20files%20contain%20libraries%2C%20resources%20and%20accessories%20files%20like%20property,needed%20to%20run%20the%20application.)
5. 
