package basicprograms;

import java.util.Scanner;

public class CharactersAtOddIndex {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(i%2!=0)
		{
			System.out.println(ch);
		}
	}

	}

}
