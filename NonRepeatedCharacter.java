/*
 * 
 * Find first non repeated character of String - 
 * Take sample String and print first non-duplicate character.
 * 
 */
package practice;

import java.util.*;
import java.util.Map.Entry;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String inpString = sc.nextLine();
		Character ch = findNonRepeatChar(inpString);
		if (ch != null) {
			System.out.println("The first non repeated character is: " + ch);
		} else {
			System.out.println("There are no non repeated characters.");
		}
		sc.close();
	}

	private static Character findNonRepeatChar(String inpString) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < inpString.length(); i++) {
			Character eachChar = inpString.charAt(i);
			// System.out.println(eachChar);

			if (map.containsKey(eachChar)) {
				map.put(eachChar, map.get(eachChar) + 1);
			} else {
				map.put(eachChar, 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) { //
			//System.out.println(entry.getValue());
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}

		return null;
	}
}
