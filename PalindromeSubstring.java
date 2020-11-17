/**
 * 
 * For given string, count how many palindromic substrings are in the string.
 * 
 */
package practice;

public class PalindromeSubstring {

	public static void main(String[] args) {
		String inputString = "MOMANDDAD";
		int count = 0;
		System.out.println("The palindromic substrings are: ");
		for (int i = 0; i < inputString.length() - 1; i++) {
			for (int j = i; j <= inputString.length() - 2; j++) {
				if (checkPalindrome(inputString.substring(i, j + 2))) {
					System.out.print(inputString.substring(i, j + 2) + ",");
					count++;
				}
			}
		}
		System.out.println("\n\nThe number of palindrome substrings in the word " + inputString + " is: " + count);
	}

	private static boolean checkPalindrome(String inputString) {
		int len = inputString.length() - 1;
		boolean isPalindrome = true;
		for (int i = 0; i < inputString.length() / 2; i++) {
			if (inputString.charAt(i) != inputString.charAt(len)) {
				isPalindrome = false;
				break;
			}
			len--;
		}
		return isPalindrome;
	}
}