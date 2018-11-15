package day13.abstractclasses;

public class Dog extends Animal {
	
	public Dog() {
		super(15); // Calling constructor of superclass, in this case it's "Animal"
		System.out.println("A dog has been created.");
	}
	
	public void eat() {
		System.out.println("A dog is eating.");
	}
	
	//public abstract eat(); --> use if there's gonna even more subclass (like Poodles/Goldens under Dog)
	
	public void sleep() {
		System.out.println("A dog is sleeping.");
	}
	
	public void ruff() {
		System.out.println("The dog says ruff.");
	}
	
	public void run() {
		System.out.println("A dog is running.");
	}

}