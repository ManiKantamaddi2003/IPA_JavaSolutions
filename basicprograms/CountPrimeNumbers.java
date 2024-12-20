package basicprograms;

import java.util.Scanner;

public class CountPrimeNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int count=0;
		int p=0;
		for(int i=0;i<str.length();i++)
		{
			p=Integer.parseInt(String.valueOf(str.charAt(i)));
		
		
		if(isVowel(p))
		{
			count++;
		}
		}
		System.out.println(count);
	}
	public static boolean isVowel(int p)
	{
		int count=0;
		if(p<=1)
		{
			return false;
		}
		for(int i=2;i<p;i++)
		{
			if(p%i==0)
			{
				 return false;
			}
		}
		return true;
	}

}
