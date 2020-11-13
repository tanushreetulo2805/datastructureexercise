import java.util.*;
public class ReverseCharacters 
{
    public static void main(String args[])
    {
        String actualWord = "IBS-Software";
        String reverseWord = reverseWord(actualWord);
        System.out.println("The Reverse String of " + actualWord + " is " + reverseWord);
        
    }
         static String reverseWord(String actualWord)
        {
            StringBuilder reverseStrBuilder = new StringBuilder();
            char[] reverseChar = actualWord.toCharArray();
            //System.out.println(reverseChar);
            for (int i = reverseChar.length - 1; i >= 0; i--)
            {
                reverseStrBuilder.append(reverseChar[i]);
                //System.out.println(reverseStrBuilder);
            }
            
            return reverseStrBuilder.toString();
        }
}