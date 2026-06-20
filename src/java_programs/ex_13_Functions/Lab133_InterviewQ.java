package java_programs.ex_13_Functions;

public class Lab133_InterviewQ {
    public static void main(String[] args) {
        main("Kuldeep");
        System.out.println(main(10));
        System.out.println(main(10.5f));
        System.out.println(main(true));
    }
    public static void main(String args) {
        System.out.println("Yes");
    }
    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }

}
