package basicprograms;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
		String n="";
		for(int i=0;i<str.length();i++)
		{
			n=str.charAt(i)+n;
			
		}
		System.out.println(n);
	}

}
