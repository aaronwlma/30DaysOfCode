package day28.regexpatternsanddatabases;

import java.util.HashSet;
import java.util.Set;

public class User {

	// Variables and parameters
	String username;
	String password;
	int age;
	Set<Integer> orderIDs;
	
	// Constructor
	public User(String customUsername, String customPassword, int customAge, Set<Integer> orderIDs) {
		this.username = customUsername;
		this.password = customPassword;
		this.age = customAge;
		this.orderIDs = orderIDs;
	}
	
	// Main method
	public static void main(String[] args) {
		Set a = new HashSet();
		a.add(1212);
		User aaron = new User("Prismee", "hello world", 10, a);
		
	}
}