package day17.moreexceptions;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

	public static final double tooHot = 185;
	public static final double tooCold = 160;

	public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException {
		if (cocoaTemp >= tooHot) {
			throw new TooHotException();
		} else if (cocoaTemp <= tooCold) {
			throw new TooColdException();
		}
	}

	// public static void main(String[] args) {
	// double currentCocoaTemp = 200;
	// try {
	// drinkHotChocolate(currentCocoaTemp);
	// System.out.println("That cocoa was good");
	// } catch(TooHotException e) {
	// System.out.println("THAT'S TOO HOT");
	// } catch(TooColdException e1) {
	// System.out.println("THAT'S SO COLD! It's like the arctic!");
	// }
	//
	// System.out.println("And it's gone.");
	// }

	public static void main(String[] args) 
			throws TooHotException, TooColdException, InterruptedException {
		double currentCocoaTemp = 170;
		boolean wrongTemp = true;
		while(wrongTemp) {
			try {
				drinkHotChocolate(currentCocoaTemp);
				System.out.println("That cocoa was good");	
				wrongTemp = false;
			} catch(TooHotException e) {
				System.out.println("THAT'S TOO HOT");
				currentCocoaTemp = currentCocoaTemp - 5;
			} catch(TooColdException e1) {
				System.out.println("THAT'S SO COLD! It's like the arctic!");
				currentCocoaTemp = currentCocoaTemp + 5;
			}
			TimeUnit.SECONDS.sleep(2);
		}
		System.out.println("And it's gone.");
	}
	
}
