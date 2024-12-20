package basicprograms;

import java.util.Scanner;

public class CountWordsStartWithVoweel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine().toLowerCase();
		String word[]=str.split(" ");
		int count=0;
		for(int i=0;i<word.length;i++)
		{
			String words=word[i];
			if(isStartWith(words))
			{
				count++;
			}
		}
		System.out.println(count);
		

	}
	public static boolean isStartWith(String word) {
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(0);
			if(ch=='a' || ch=='e' ||ch=='i'|| ch=='o' || ch=='u')
			{
				return true;
			}
		}
		return false;
	}

}
