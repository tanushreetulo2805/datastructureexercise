import java.util.*; 
public class DuplicateCharacters {
    
    public static void main(String args[]) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String: ");
	    String inpString = sc.nextLine();   
		numOfDupCharacters(inpString); 
	} 

	public static void numOfDupCharacters(String inpString) 
	{
	    Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
		char[] charArray = inpString.toCharArray(); 
		for (char c : charArray) { 
			if (dupMap.containsKey(c)) { 
				dupMap.put(c, dupMap.get(c) + 1); 
			} 
			else { 
				dupMap.put(c, 1); 
			} 
		} 
		for (Map.Entry<Character, Integer> entry : dupMap.entrySet()) {
			if (entry.getValue() > 1) {
			    System.out.println("The duplicate characters in the string "+ inpString + " are: " + entry.getKey()); 
			}
		}
	} 
} 
