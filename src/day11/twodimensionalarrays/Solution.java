package day11.twodimensionalarrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Properties, Fields, Global Variables
    private static final Scanner scanner = new Scanner(System.in);

    // Main Method
    public static void main(String[] args) {
        
        // Initializes input array object
        int[][] arr = new int[6][6];
        
        // Parses and creates input array item into arr[i][j]
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        // Statement that calculates the initial sum of the hourglass
        int initSum = arr[0][0] + arr[0][1] + arr[0][2]
                + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
        int maxSum = initSum;
        
        // For-loop that scans each row
        for (int a = 0; a <= 3; a++) {
            // For-loop that scans each column
            for (int b = 0; b <= 3; b++) {
                // Statement that calculates the sum of the hourglass
                int sum = arr[a][b] + arr[a][b+1] + arr[a][b+2]
                        + arr[a+1][b+1] + arr[a+2][b] + arr[a+2][b+1] + arr[a+2][b+2];
                if (sum > maxSum) {
                    // Compares to max sum and stores if largest
                    maxSum = sum;
                }
            }
        }
        
        // Print statement that prints out max sum
        System.out.println(maxSum);
        
        // Close scanner
        scanner.close();
    }
}