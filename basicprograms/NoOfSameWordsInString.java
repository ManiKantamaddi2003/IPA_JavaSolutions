package basicprograms;

import java.util.Scanner;

public class NoOfSameWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String str1="Home";
		String[] words=str.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			if(word.equalsIgnoreCase(str1))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
