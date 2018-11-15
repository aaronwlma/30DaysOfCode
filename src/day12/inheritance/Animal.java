package day12.inheritance;

public class Animal {
	
	// Initialize Variables
	private int age; // VS public int age; If you use public, any of your subclasses can access your variables
					// Better practice is to make your variable private, and create a getter to grab the private variable for you
	
	// Constructor
	public Animal(int age) {
		this.age = age;
		System.out.println("An animal has been created.");
	}
	
	// Methods
	public void eat() {
		System.out.println("An animal is eating.");
	}
	
	// Getters
	public int getAge() {
		return age;
	}
	
	// Main Method
	public static void main(String[] args) {
		Animal a = new Animal(5);
		Dog d = new Dog();
		Cat c = new Cat();
		d.ruff();
		System.out.println(d.getAge());
		c.meow();
		System.out.println(c.getAge());
		a.eat();
		d.eat();
		c.eat();
		d.run();
		c.prance();
		
		// What happens if...
		// Dog o = new Animal(3);
		// Animal o = new Dog();
		
		
	}
}