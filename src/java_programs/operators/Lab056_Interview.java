package java_programs.operators;

public class Lab056_Interview {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A';
        String s1 = "A";
        System.out.println(c+s); //75  // char + short ---> int Java performs type promotion.
        System.out.println(c); // A -----> It prints the actual character.
        System.out.println(c+c); // 130
        System.out.println(c+s1); // AA // char + String -----> When one operand is String,Java performs String concatenation.
    }
}
