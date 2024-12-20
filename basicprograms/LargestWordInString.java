package basicprograms;

import java.util.Scanner;

public class LargestWordInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[] words=str.split(" ");
		String largestword="";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			if(word.length()>largestword.length())
			{
				largestword=word;
			}
		}
		System.out.println(largestword);
		

	}

}
