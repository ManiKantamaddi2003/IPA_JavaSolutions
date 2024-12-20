package basicprograms;

import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        String[] words = str.split(" ");
        int sum = 0;

        // Calculate sum of numeric values in the string
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.matches("\\d+")) {
                sum += Integer.parseInt(word);
            }
        }

        // Print the original string 'sum' number of times
        for (int i = 0; i < sum; i++) {
            System.out.print(str);
            if (i < sum - 1) { // Avoid printing a space after the last repetition
                System.out.print(" ");
            }
        }
        
        // Close the scanner
        scan.close();
    }
}

