package day01.datatypes;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		
		Scanner scan = new Scanner(System.in);
		
		/* Declare second integer, double, and String variables. */
		/* Read and save an integer, double, and String to your variables.*/
		int nextInt = scan.nextInt();
		double nextDouble = scan.nextDouble();
		scan.nextLine();
		String nextString = scan.nextLine();
		// Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
		
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + nextInt);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + nextDouble);
		/* Concatenate and print the String variables on a new line; 
		the 's' variable above should be printed first. */
		System.out.println(s + nextString);
		
		scan.close();
	}
}