package day03.introtoconditionalstatements;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	public static int isNumberOdd(int N) {
		if (Math.abs(N) % 2 == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public static int isNumberInclusive1(int N) {
		if (N >= 2 && N <= 5) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static int isNumberInclusive2(int N) {
		if (N >= 6 && N <= 20) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if (isNumberOdd(N) == 1) {
			System.out.println("Weird");
		}
		else {
			if (isNumberInclusive1(N) == 1) {
				System.out.println("Not Weird");
			}
			if (isNumberInclusive2(N) == 1) {
				System.out.println("Weird");
			}
			else {
				System.out.println("Not Weird");
			}
		}      
		scanner.close();
	}
}