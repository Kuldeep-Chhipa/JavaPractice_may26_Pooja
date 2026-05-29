package java_programs.ex_06_Ternary_Operator;

public class Lab063_TO_P1 {
    public static void main(String[] args) {
        int number = 0;
        String res = number > 0 ? "Positive Number" : "Negative Number";
        System.out.println(res);
        String res1 = number == 0 ? "Number is Zero" : number > 0 ? "Positive Number" : "Negative Number";
        System.out.println(res1);
    }
}
