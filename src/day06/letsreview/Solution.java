package day06.letsreview;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] word = new String[scanner.nextInt()];
        int index = 0;

        while (scanner.hasNext()) {
            word[index] = scanner.next();
            int j = 0;
            int k = 0;
            char[] wordArrayEven = new char[(int) Math.ceil(word[index].length() / 2.0)];
            char[] wordArrayOdd = new char[(int) Math.floor(word[index].length() / 2.0)];
            
            for (int i = 0; i < word[index].length(); i++) {
                char wordArray[] = word[index].toCharArray();
                
                if (Math.abs(i) % 2 == 0) {
                    wordArrayEven[j] = wordArray[i];
                    j++;
                }
                else {
                    wordArrayOdd[k] = wordArray[i];
                    k++;
                }
            }
            
            System.out.println(new String(wordArrayEven) + " " + new String(wordArrayOdd));
            index++;
        }
        
        scanner.close();
        
    }
}