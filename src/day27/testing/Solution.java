package day27.testing;

import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
        static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            int[] emptyIntArray = new int[0];
            return emptyIntArray;
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            int maxSize = 10;
            int minSize = 2;
            Random rand = new Random();
            int randomSize = rand.nextInt((maxSize-minSize) + 1) + minSize;
            
            int[] uniqueIntArray = new int[randomSize];
            for (int i = 0; i < uniqueIntArray.length; i++) {
                uniqueIntArray[i] = i;
            }
            
            return uniqueIntArray;
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            int maxSize = 10;
            int minSize = 2;
            Random rand = new Random();
            int randomSize = rand.nextInt((maxSize-minSize) + 1) + minSize;
            
            int[] twoDiffMinIntArray = new int[randomSize];
            for (int i = 0; i < twoDiffMinIntArray.length - 1; i++) {
                twoDiffMinIntArray[i] = i;
            }
            twoDiffMinIntArray[twoDiffMinIntArray.length - 1] = 0;
            
            return twoDiffMinIntArray;
            
        }

        public static int get_expected_result() {
            // complete this function
            return 0;
        }
    }
     
	public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}