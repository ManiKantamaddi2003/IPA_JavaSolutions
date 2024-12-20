package basicprograms;

import java.util.Scanner;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int vowel=0;
		int consonent=0;
		int num=0;
		int special=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				char ch=str.charAt(i);
				if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u')
				{
					vowel++;
				}
				else
				{
					consonent++;
				}
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				num++;
			}
			else {
				special++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonent);
		System.out.println(num);
		System.out.println(special);

	}

}
