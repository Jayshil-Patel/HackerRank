package Hackerrank.solutions.Introduction;



import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();

		String firstLetter = A.substring(0, 1);
		String remainingLetters = A.substring(1, A.length());
		firstLetter = firstLetter.toUpperCase();
		A = firstLetter + remainingLetters;

		String B=sc.next();

		String firstLetter_2 = B.substring(0, 1);
		String remainingLetters_2 = B.substring(1, B.length());
		firstLetter_2 = firstLetter_2.toUpperCase();
		B = firstLetter_2 + remainingLetters_2;

		String space = " ";
		String C=A+space+B;

		System.out.println(C.length()-1);
		int compare = A.compareTo(B);

		if (compare<=0){
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		System.out.println(C);

	}
}
