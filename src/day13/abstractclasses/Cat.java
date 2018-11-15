package day13.abstractclasses;

public class Cat extends Animal {

	public Cat() {
		super(7);  // Calling constructor of superclass, in this case it's "Animal"
		System.out.println("A cat has been created.");
	}
	
	public void eat() {
		System.out.println("A cat is eating.");
	}
	
	//public abstract eat(); --> use if there's gonna even more subclass (like Poodles/Goldens under Dog), eat() has to be in all classes that implements
	
	public void sleep() {
		System.out.println("A cat is sleeping.");
	}
	
	// Methods
	public void meow() {
		System.out.println("A cat meows.");
	}
	
	public void prance() {
		System.out.println("A cat is prancing.");
	}
}