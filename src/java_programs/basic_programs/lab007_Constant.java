package java_programs.basic_programs;

public class lab007_Constant {
    public static void main(String[] args) {
        // constants are used to store fixed values in java
        // there are different types of constants in java such as final variables,
        // enum constants etc.
        // final variables are variables that cannot be changed once they are assigned a
        // value
        // enum constants are a special type of constant that is used to define a set
        // of named values

        final int a = 10; // a is a final variable and 10 is a literal of type int
        final float b = 20.5f; // b is a final variable and 20.5f is a literal of type float
        final double c = 30.5; // c is a final variable and 30.5 is a literal of type double
//         a= 20; // this will give an error because a is a final variable and cannot be changed

        System.out.println("The value of a is: " + a); // printing the value of constant a = 10
        System.out.println("The value of b is: " + b); // printing the value of constant b = 20.5
        System.out.println("The value of c is: " + c); // printing the value of constant c = 30.5

    }
}
