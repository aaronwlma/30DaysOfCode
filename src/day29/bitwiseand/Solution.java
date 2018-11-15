package day29.bitwiseand;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Initialize relevant variables
    private static final Scanner scanner = new Scanner(System.in);

    // Method to find max possible
    public static int calculateMax(int nIn, int kIn) {
        // Initialize useful variables
        int max = 0;
        if (((kIn - 1) | kIn) > nIn && kIn%2 == 0) {
            max = kIn - 2;
        }
        else {
            max = kIn - 1;
        }

        return max;
    }
    
    // Main method
    public static void main(String[] args) {
        // Variables for scanner
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Iterate through the integers
        for (int tItr = 0; tItr < t; tItr++) {
            // Parse the string for information
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            // Calculate max difference
            int max = calculateMax(n, k);
            
            // Print out the max difference
            System.out.println(max);
        }

        // Close the scanner
        scanner.close();
    }
}