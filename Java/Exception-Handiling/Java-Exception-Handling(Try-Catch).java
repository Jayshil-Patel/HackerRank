import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                int z = x / y;
                System.out.println(z);
            }
            catch (ArithmeticException ee){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }


        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
