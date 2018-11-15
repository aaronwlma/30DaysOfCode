package day13.abstractclasses;

public abstract class Animal {
	
	// Initialize Variables
	private int age; // VS public int age; If you use public, any of your subclasses can access your variables
					// Better practice is to make your variable private, and create a getter to grab the private variable for you
	
	// Constructor
	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created.");
	}
	
	// Method -> Abstract Class
	public abstract void eat();
	
	public void sleep() {
		System.out.println("A animal is sleeping.");
	}
	
	// Getters
	public int getAge() {
		return age;
	}
	
	// Main Method
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.eat();
		c.eat();
		d.sleep(); // ---> Says DOG bc sleep() method in dog overrides the animal sleep()
		c.sleep(); // ---> Says ANIMAL bc no override method in cat class
		
		// Casting
		Object dog = new Dog();
		Dog realDog = (Dog) dog;
		realDog.ruff();
		
		Object str = "est";
		String realS = (String) str;
		realS.getBytes();
		
		// What happens when...
		Dog doggy = new Dog();
		if (doggy instanceof Animal) {
			Animal animal = (Animal) doggy;
			animal.sleep();
		}
		doggy.sleep();
	}
}