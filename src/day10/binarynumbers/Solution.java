package day10.binarynumbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static String decToBinary(int n) {
        String convertedNum= "";
        StringBuilder reversedNum = new StringBuilder(32);
        while (n > 0) {
            int remainder = n % 2;
            n = n / 2;
            convertedNum = convertedNum.concat(Integer.toString(remainder));
        }
        reversedNum = reversedNum.append(convertedNum);
        reversedNum = reversedNum.reverse();
        return reversedNum.toString();
    }
    
    public static int countMaxOnes(String n) {
        // Initialize counter:
        int counter = 0;
        int counterMax = 0;
        
        // For-loop to count consecutive 1s
        for (int i = 0; i < n.length(); i++) {
            // If the character is a 1, increase the counter by 1
            if (n.charAt(i) == '1') {
                counter++;
                // Update the counterMax if counter is larger
                if (counter > counterMax) {
                    counterMax = counter;
                }
            }
            // Reset the counter back to 0 if it's not consecutive
            else {
                counter = 0;
            }
        }
        // Return the maximum number of consecutive 1s 
        return counterMax;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //System.out.println(decToBinary(n));
        //System.out.println(countMaxOnes(n));
        System.out.println(countMaxOnes(decToBinary(n)));
        scanner.close();
    }
}