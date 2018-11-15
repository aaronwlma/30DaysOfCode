package day08.dictionariesandmaps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// English to Japanese Dictionary
		Map<String, String> engJpnDictionary = new HashMap<String, String>();
		// Putting things inside our dictionary
		engJpnDictionary.put("Monday", "Getsuyoubi");
		engJpnDictionary.put("Tuesday", "Kayoubi");
		engJpnDictionary.put("Wednesday", "Suiyoubi");
		engJpnDictionary.put("Thursday", "Mokuyoubi");
		engJpnDictionary.put("Friday", "Kinyoubi");
		engJpnDictionary.put("Saturday", "Doyoubi");
		engJpnDictionary.put("Sunday", "Nichiyoubi");
		
		// Print things from inside our dictionary
		System.out.println("Stuff we put in our dictionary using get():");
		System.out.println(engJpnDictionary.get("Monday"));
		System.out.println(engJpnDictionary.get("Tuesday"));
		System.out.println(engJpnDictionary.get("Wednesday"));
		System.out.println(engJpnDictionary.get("Thursday"));
		System.out.println(engJpnDictionary.get("Friday"));
		System.out.println(engJpnDictionary.get("Saturday"));
		System.out.println(engJpnDictionary.get("Sunday"));
		
		// Print space
		System.out.println();
		
		// Print out all keys
		System.out.println("Our keys: " + engJpnDictionary.keySet());
		// Print out all key values
		System.out.println("Our values: " + engJpnDictionary.values());
		// Print out size of dictionary
		System.out.println("The size of our dictionary is: " + engJpnDictionary.size());
		
		// Print space
		System.out.println();
		
		// Initialize Shopping List
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
		// Put some stuff in our shopping list dictionary
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		
		// Print things from inside our dictionary
		System.out.println("Print initial ham status: " + shoppingList.get("Ham"));
		System.out.println("Print initial Oreos status: " + shoppingList.get("Oreos"));
		// Print key-value pairs
		System.out.println("List after put() method: " + shoppingList.toString());
		// Check if the shopping list is empty
		System.out.println("Check if list is empty: " + shoppingList.isEmpty());
		
		// Print space
		System.out.println();
		
		// Remove things from dictionary
		shoppingList.remove("Eggs");
		// Replace values for a certain key
		shoppingList.replace("Bread", Boolean.FALSE);
		
		// Print key-value pairs again
		System.out.println("After removing and replacing: " + shoppingList.toString());
		
		// Print space
		System.out.println();
		
		// Clear out dictionary
		shoppingList.clear();
		
		// Print key-value pairs again
		System.out.println("List after clear() method: " + shoppingList.toString());
		// Check if the shopping list is empty
		System.out.println("Check if list is empty: " + shoppingList.isEmpty());
	}
}