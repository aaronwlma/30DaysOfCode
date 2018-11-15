package day21.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
	
	public static <E> void printArray(E[] array) {
//		System.out.print("[");
		for (E element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
//		for (int i = 0; i < array.length; i++) {
//			E item = array[i];
//			System.out.print(item);
//			if (i < array.length - 1) { 
//				System.out.print(", ");
//			}
//		}
//		System.out.println("]");
	}
	
//	public static void printArray(String[] array) {
//		System.out.print("[");
//		for (int i = 0; i < array.length; i++) {
//			String item = array[i];
//			System.out.print(item);
//			if (i < array.length - 1) { 
//				System.out.print(", ");
//			}
//		}
//		System.out.println("]");
//	}
	
	public static void main(String[] args) {
		
		//  Index:  0  1  2  3  4
		//  Array:  [0, 5, 3, 2, 1] ---> length 5
		
		//  Random Objects from Array
		//  Math.abs(rand.nextInt) % length;
		
		//  Index:  0      1        2
		//  Array:  ["Bob", "Sally", "Max"] ---> length 3
		
		//  Declaring, Allocating, Initializing
		//  Declaring
		Integer[] intArray1;
		//  Allocating
		Integer[] intArray2 = new Integer[4];
		printArray(intArray2);
		//  Initializing
		Integer[] intArray3 = {5, 2, 9, 1, 3};
		
		String[] shoppingList = {"bananas", "apples", "pears",};

		//  Index:  0  1  2  3
		//  Array:  [10, 8, 5, 10] ---> length 4
		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;
		
		//  Print out Arrays
		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		System.out.println();
		
		//  Custom print out Arrays
		printArray(intArray2);
		printArray(intArray3);
		System.out.println();
		
		//  Retrieve objects
		System.out.println(intArray2[3]);
		System.out.println(Array.get(intArray2, 3));
		System.out.println();
		
		//  Given functions
		Arrays.sort(intArray3);
		printArray(intArray3);
		System.out.println();
		
		//  Print string array
		printArray(shoppingList);
		System.out.println();
		
		System.out.println("Special For Loop:");
		//  Special foop loop:  foreach
		for(String s : shoppingList) {
			System.out.println(s);
		}
	}
}