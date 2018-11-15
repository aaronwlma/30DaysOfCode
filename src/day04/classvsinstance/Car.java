package day04.classvsinstance;

public class Car {
	//Instance Variables
	int maxSpeed = 100;
	int minSpeed = 0;
	
	double weight = 4079;
	
	boolean isTheCarOn = false;
	char condition = 'A';
	String nameOfCar = "Lucy";
	
	double maxFuel = 16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numberOfPeopleInCar = 1;
	int maxNumberOfPeopleInCar = 6;
	
	public Car() {
		
	}
	
	public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
	}
	
	// Getters and Setters

	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		this.maxSpeed = newMaxSpeed;
	}
	
	public int getMinSpeed() {
		return this.minSpeed;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public boolean getIsTheCarOn() {
		return this.isTheCarOn;
	}
	
	public void printVariables() {
		System.out.println("This is the max speed " + maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
		System.out.println(nameOfCar);
		System.out.println(numberOfPeopleInCar);
	}
	
	public void upgradeMaxSpeed() {
		setMaxSpeed(getMaxSpeed() + 10);
	}
	
	public void upgradeMinSpeed() {
		minSpeed = maxSpeed;
		maxSpeed = maxSpeed + 1;
	}
	
	public void getIn() {
		//Same as numberOfPeopleInCar = numberOfPeopleInCar + 1;
		if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
			numberOfPeopleInCar++;
			System.out.println("Someone got in");
		}
		else {
			System.out.println("The car is full! " + numberOfPeopleInCar + " = " + maxNumberOfPeopleInCar);
		}
	}
	
	public void getOut() {
		// If there's people in the car
		if (numberOfPeopleInCar > 0) {
			// then tell one person to get out
			numberOfPeopleInCar--;
		}
		else {
			// then there is no one inside to get out
			System.out.println("No one is in the car " + numberOfPeopleInCar);
		}
	}
	
	public double howManyMilesTillOutOfGas() {
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillUp() {
		return maxFuel * mpg;
	}
	
	public void wreckCar() {
		condition = 'C';
	}
	
	public void turnTheCarOn() {
		// If the car isn't on...		
		if (!isTheCarOn) {
			// turn it on
			isTheCarOn = true;
		}
		else {
			// otherwise print out the fact that it's on
			System.out.println("The car is already on " + isTheCarOn);
		}
	}
	
	public static void main(String[] args) {
		Car tommyCar = new Car();
		tommyCar.getOut();
		tommyCar.getOut();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.getIn();
		tommyCar.turnTheCarOn();
		tommyCar.turnTheCarOn();
		
//		System.out.println("Christmas Car");
//		Car christmasPresent = new Car(550, 2000, false); 
//		christmasPresent.printVariables();
	}
}