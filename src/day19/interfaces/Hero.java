package day19.interfaces;

public class Hero implements Character {

	// Instance Variables
	public String weapon = "The Force";
	
	
	
	// Methods
	@Override
	public String getWeapon() {
		return weapon;
	}
	public void attack() {
		System.out.println("The hero attacks the enemy!");
	}
	
	public void heal() {
		System.out.println("The hero heals you!");
	}
	
}