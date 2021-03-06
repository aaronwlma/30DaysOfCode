package day20.sorting;

import static day20.sorting.HairColor.*;

public class Person {
	
	HairColor hairColor = BLACK;
	
	public Person() {
		int a = 5;
	}
	
	public static void main(String[] args) {
		Person peterParker = new Person();
		Person spiderMan = peterParker;
		
		System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
		System.out.println("Hair color of Spiderman: " + spiderMan.hairColor);
		
		peterParker.hairColor = PINK;
		
		System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
		System.out.println("Hair color of Spiderman: " + spiderMan.hairColor);
		
		spiderMan.hairColor = BLONDE;
		
		System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
		System.out.println("Hair color of Spiderman: " + spiderMan.hairColor);
		
	}
	
}