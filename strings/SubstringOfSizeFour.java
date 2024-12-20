package strings;

public class SubstringOfSizeFour {

	 public static void main(String[] args) {
	        String input = "mississipp"; // Input string
	        printSubstringsOfSizeFour(input);
	    }

	    // Method to print all substrings of size 4
	    public static void printSubstringsOfSizeFour(String str) {
	        int length = str.length();

	        // Check if the string is shorter than 4
	        if (length < 4) {
	            System.out.println("The string is too short to have substrings of size 4.");
	            return;
	        }

	        // Loop through the string and print substrings of size 4
	        for (int i = 0; i <= length - 4; i++) {
	            String substring = str.substring(i, i + 4);
	            System.out.println(substring);
	        }
	    }
	}
