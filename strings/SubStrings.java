package strings;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String s = scan.nextLine();
	        String longestPalindrome="";
	        // Loop to get substrings of different lengths
	        for (int length = 1; length <= s.length(); length++) { // Changed the condition to include last character
	            for (int i = 0; i <= s.length() - length; i++) {
	                String str = "";
	                
	                // Construct the substring of the current length
	                for (int j = i; j < i + length; j++) { // Changed the increment variable to 'j'
	                    str = str + s.charAt(j);  // Corrected str concatenation
	                    
	                    
	                }
	                //System.out.println(str);
	                
					if (!palindrom(str) && str.length() > longestPalindrome.length()) {
	                    longestPalindrome = str; // Update longest palindrome
	            }
					
	            }
	        }
	        System.out.println(longestPalindrome);

}
	public static boolean palindrom(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		String se=sb.reverse().toString();
		
		if(se.equals(str))
		{
			return true;
		}
		return false;
		
	}
}
