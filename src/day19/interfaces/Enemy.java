package day19.interfaces;

public class Enemy implements Character {
	
	//Instance Variables
	public String weapon = "Lightsaber";
	
	// Constructor
	public Enemy() {
		
	}
	
	// Methods
	@Override
	public String getWeapon() {
		return weapon;
	}
	@Override
	public void attack() {
		System.out.println("The enemy attacks YOU!");
	}
	@Override
	public void heal() {
		System.out.println("The enemy heals himself...");
	}
	
	public void weaponDraw() {
		System.out.print("Enemy draws out weapon");
	}
}