package java_programs.ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;

//        int total =course + gst;  // Narrow - Implicit
        int total = course + (int) gst;
        System.out.println("Total is " + total);

        float total1 = course + gst;  // Widening - auto - implicit
        System.out.println("Total is " + total1);  // 118.45
        float total2 = (float) course + gst; // Widening - Explicit
        System.out.println("Total is " + total2);  // 118.45
    }
}
