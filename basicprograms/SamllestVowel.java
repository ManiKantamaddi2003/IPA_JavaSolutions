package basicprograms;

import java.util.Scanner;

public class SamllestVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		char smallvowel='\0';
		for(int i=0;i<word.length();i++)
		{
			char ch=word.charAt(i);
			if(isVowel(ch))
			{
				if(smallvowel=='\0' || ch<smallvowel)
				{
					smallvowel=ch;
				}
			}
		}
		if(smallvowel!='\0')
		{
			System.out.print(smallvowel);
		}
		else
		{
			System.out.print("not found");
		}

	}
	public static boolean isVowel(char ch) {
		if(ch=='a'|| ch=='e' ||ch=='i' ||ch=='o' || ch=='u')
		{
			return true;
		}
		return false;
	}

}
