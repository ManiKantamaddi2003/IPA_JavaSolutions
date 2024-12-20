package basicprograms;

import java.util.Scanner;

public class firstletterofWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String s="";
		s=s+input.charAt(0);
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(ch==' ')
			{
				s=s+input.charAt(i+1);
			}
			
		}
		System.out.println(s);
		
	}

}
