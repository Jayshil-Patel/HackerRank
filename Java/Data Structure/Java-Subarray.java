import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array_length = scan.nextInt();
        int input_array[] = new int[array_length];

        for (int i = 0; i < array_length; i++) {
            input_array[i] = scan.nextInt();
        }



        int negativesubarraycount = 0;

        for (int i = 0; i < array_length; i++) {
            int subarraysum = 0;

            for (int j = i; j < array_length; j++) {
                subarraysum += input_array[j];

                if (subarraysum < 0) {
                    ++negativesubarraycount;
                }
            }
        }

        System.out.println(negativesubarraycount);

    }
}
