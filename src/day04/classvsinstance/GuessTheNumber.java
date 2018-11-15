package day04.classvsinstance;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	int theNumber;
	int maxNumber;
	Scanner scanner = new Scanner(System.in);
	
	public GuessTheNumber() {
		Random rand = new Random();
		maxNumber = 100;
		theNumber = Math.abs(rand.nextInt()) % (maxNumber + 1);
	}
	
	public void play() {
		while(true) {
			int move = scanner.nextInt();
			if (move > theNumber) {
				System.out.println("Your number is too big");
			}
			else if (move < theNumber) {
				System.out.println("Your number is too small");
			}
			else {
				System.out.println("You got it!");
				break;
			}
		}
	}
	
	public static void howBigIsMyNumber(int x) {
		if (x >= 0 && x <= 10) {
			System.out.println("Our number is pretty small");
		}
		else if (x >= 11 && x <= 100) {
			System.out.println("Our number is pretty big");
		}
		else {
			System.out.println("Our number is out of range");
		}
	}
	
	public static void main(String[] args) {
		GuessTheNumber guessGame = new GuessTheNumber();
		System.out.println("Welcome to my game.  Try and guess my impossible number between 0 and " + guessGame.maxNumber + ".");
		guessGame.play();
	}
	
}