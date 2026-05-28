package java_programs.basic_programs;

public class lab006 {
    public static void main(String[] args) {
        // variables are used to store data in java
        // there are different types of variables in java such as int, float, double,
        // char, boolean etc.
        // identifiers are the names given to variables, methods, classes etc. in java
        // literals are the values assigned to variables in java
        // data types are the types of data that can be stored in variables in java

        int a = 10; // a is an identifier and 10 is a literal of type int
        float b = 20.5f; // b is an identifier and 20.5f is a literal of type float
        double c = 30.5; // c is an identifier and 30.5 is a literal of type double

        // if data type char and literal is 'A' then we need to use single quotes to
        // assign the value. Printing the char directly shows the character; to
        // print its ASCII (numeric) value cast the char to int.

        char d = 'A'; // d is an identifier and 'A' is a literal of type char
        boolean e = true; // e is an identifier and true is a literal of type boolean

        System.out.println("The value of a is: " + a); // printing the value of variable a = 10
        System.out.println("The value of b is: " + b); // printing the value of variable b = 20.5
        System.out.println("The value of c is: " + c); // printing the value of variable c = 30.5
        System.out.println("The value of d is: " + d); // prints the character 'A'
        System.out.println("The ASCII value of d is: " + (int) d); // prints 65
        System.out.println("The value of e is: " + e); // printing the value of variable e = true
    }
}
