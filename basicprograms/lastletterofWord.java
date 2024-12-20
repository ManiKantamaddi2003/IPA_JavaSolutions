package basicprograms;

import java.util.Scanner;

public class lastletterofWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String words[]=input.split(" ");
		System.out.println("Last letter of each word: ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // Get the last character of the word
            char lastChar = word.charAt(word.length() - 1);
            if(Character.isAlphabetic(lastChar))
            {
            System.out.print(lastChar + " ");
            }
            else {
            	continue;
            }
        }
        System.out.println();
        System.out.print("First Character: ");
        for(int i=0;i<words.length;i++)
        {
        	String word=words[i];
        	char firstchar=word.charAt(0);
        	System.out.println(firstchar);
        }
        
      

	}

}
