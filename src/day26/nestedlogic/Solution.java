package day26.nestedlogic;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Scan for variables and initialize
        Scanner sc = new Scanner(System.in);
        int actualDay = sc.nextInt();
        int actualMonth = sc.nextInt();
        int actualYear = sc.nextInt();
        int expectedDay = sc.nextInt();
        int expectedMonth = sc.nextInt();
        int expectedYear = sc.nextInt();
        int fine = 0;
        
        // Check if actual time is before expected time, no fine
        if (actualYear <= expectedYear 
                && actualMonth <= expectedMonth 
                && actualDay <= expectedDay) {
            fine = 0;
        } 
        // Else, actual time is after expected time, yes fine
        else {
            // Case 1: Returned within the same calendar year and month, fine = 15*daysLate
            if (actualYear == expectedYear 
                    && actualMonth == expectedMonth 
                    && actualDay > expectedDay) {
                fine = 15 * (actualDay-expectedDay);
            }
            // Case 2: Returned within the same calendar year, fine = 500*monthsLate
            else {
                if (actualYear == expectedYear 
                        && actualMonth > expectedMonth 
                        && actualDay > expectedDay) {
                    fine = 500*(actualMonth-expectedMonth);
                }
                // Case 3: Returned over a year late, fine = 10000
                else {
                    if (actualYear > expectedYear) {
                        fine = 10000;
                    }
                }
            }
        }
        
        // Print out the calculated fine
        System.out.println(fine);

        
    }
}