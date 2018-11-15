package day16.exceptionsstringtointeger;

public class ExceptionsPractice {
	
	public static void main(String[] args) {
//		int[] intArray = new int[10];
//		System.out.println(intArray[10]);
		
		try {
			int[] c = new int[6];
			System.out.println("Element 6 at index 5 = " + c[10]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown " + e);
		} finally {
			System.out.println("Finally finished try-catch");
		}
		
//		System.out.println("Finally finished try-catch");
		
	}
}