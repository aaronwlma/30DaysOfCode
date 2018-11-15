package day05.loops;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void multiplyTenTimes(int a) {
        for (int x = 1; x <= 10; x++) {
            int y = a*x;
            System.out.println(a + " x " + x + " = " + y);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        multiplyTenTimes(n);
        scanner.close();
    }
}