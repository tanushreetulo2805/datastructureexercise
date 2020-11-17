/*
 * 
 * Print duplicate characters from string -
 * Take sample string and print all duplicate characters.
 *
 */
package practice;

import java.util.*;

public class DuplicateCharacters {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String inpString = sc.nextLine();
		// String inpString = "IBS Software PVT LTD";
		numOfDupCharacters(inpString);
		sc.close();
	}

	public static void numOfDupCharacters(String inpString) {
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		char[] charArray = inpString.toCharArray();
		for (char c : charArray) {
			if (dupMap.containsKey(c)) {
				dupMap.put(c, dupMap.get(c) + 1);
			} else {
				dupMap.put(c, 1);
			}
		}
		System.out.print("The duplicate characters in the string " + inpString + " are: ");
		dupMap.forEach((key, value) -> {
			if (value > 1 && !key.equals(' ')) {
				System.out.print(key + ",");
			}

		});
	}
}
