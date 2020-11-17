/*
 * 
 * Reverse words in a sentence - Take sample sentence and print reverse words of sentence.
 * 
 */
package practice;

import java.util.*;

public class ReverseWords {
	public static void main(String[] args) {
		String inpString = "IBS Software PVT LTD";
		reverseSentence(inpString);
	}

	static void reverseSentence(String inpString) {
		Stack<String> sentenceStack = new Stack<>();
		String temp = "";
		for (int i = 0; i < inpString.length(); i++) {
			if (inpString.charAt(i) == ' ') {
				sentenceStack.add(temp);
				temp = "";
			} else {
				temp = temp + inpString.charAt(i);
			}
		}
		sentenceStack.add(temp);
		while (!sentenceStack.isEmpty()) {
			temp = sentenceStack.peek();
			System.out.print(temp + " ");
			sentenceStack.pop();
			// System.out.println(sentenceStack);
		}
	}

}
