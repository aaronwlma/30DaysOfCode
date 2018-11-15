package day25.runningtimeandcomplexity;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Start the scanner and set up environment to do line by line evaluation
        Scanner sc = new Scanner(System.in);
        int numOfTests = sc.nextInt();
        while (numOfTests-- > 0) {
            int element = sc.nextInt();
            // Evaluate the number and return if prime
            boolean isPrime = true;
            
            // Check for prime
            for (int i = 2; i*i <= element; i++) {
                if (element % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime == true) {
                // Make sure to cover exception cases
                if (element == 1 || element == 0) {
                    System.out.println("Not prime");
                }
                else {
                    System.out.println("Prime");
                }
            }
            else {
                System.out.println("Not prime");
            }
        }

    }
}