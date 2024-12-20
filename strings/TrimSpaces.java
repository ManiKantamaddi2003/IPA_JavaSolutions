package strings;

public class TrimSpaces {
	public static void main(String args[])
	{
		String input="   now set go   .   ";
		 String trimmed = input.trim(); // Removes leading spaces
	        System.out.println("Original: '" + input + "'");
	        System.out.println("Trimmed: '" + trimmed + "'");
	}
}
