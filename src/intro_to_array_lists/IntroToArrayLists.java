package intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> colors = new ArrayList<String>();
		//2. Add five Strings to your list
		colors.add("red");
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < colors.size(); i++){
			String s = colors.get(i);
			System.out.println("Set 1: " + s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : colors){
			System.out.println("Set 2: " + s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < colors.size(); i+=2){
			String s = colors.get(i);
			System.out.println("Set 3: " + s);
		}
		//6. Print all the Strings in reverse order.
		for(int i = colors.size()-1; i > -1; i--){
			String s = colors.get(i);
			System.out.println("Set 4: " + s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < colors.size(); i++){
			String s = colors.get(i);
			if (s.contains("e")) {
				System.out.println("Set 5: " + s);
			}
		}
	}
}
