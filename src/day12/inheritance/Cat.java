package day12.inheritance;

public class Cat extends Animal {

	public Cat() {
		super(7);  // Calling constructor of superclass, in this case it's "Animal"
		System.out.println("A cat has been created.");
	}
	
	// Methods
	public void meow() {
		System.out.println("A cat meows.");
	}
	
	public void prance() {
		System.out.println("A cat is prancing.");
	}
}