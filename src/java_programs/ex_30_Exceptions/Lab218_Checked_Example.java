package java_programs.ex_30_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab218_Checked_Example {
    public static void main(String[] args) throws FileNotFoundException {
        //  Checked exception
         FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
