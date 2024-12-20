package basicprograms;

import java.util.Scanner;

public class find_lowercse {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = scan.nextLine();
	        scan.close();
	        int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                count++;
	            }
	        }
	        System.out.println("Number of lowercase letters: " + count);
	    }
}
