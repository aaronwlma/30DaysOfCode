package day28.regexpatternsanddatabases;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Takes a string and checks if there is the "@gmail.com" ending
    public static boolean isGmail(String email) {
        String toCompare = "@gmail.com";
        Pattern p = Pattern.compile(toCompare);
        Matcher m = p.matcher(email);
        
        if (m.find()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    // Takes a list of names, sorts them, and then prints them out per line
    public static void sortAlphabetically(List nameList) {
        Collections.sort(nameList);
        for (int i = 0; i <= nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize relevant variables
        List<String> listOfNames = new ArrayList<String>();
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // Iterate through each line and add names with gmail
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if (isGmail(emailID)) {
                // Add to list of names
                listOfNames.add(firstName);
            }
        }
        
        // Sort names alphabetically and print in order
        sortAlphabetically(listOfNames);
        
        // Close the scanner
        scanner.close();
    }
}