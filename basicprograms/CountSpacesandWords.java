package basicprograms;

import java.util.Scanner;

public class CountSpacesandWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		String arr[]=str.split(" ");
		int words=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=" ")
			{
				words++;
			}
		}
		int letter=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				letter++;
			}
		}
		
		System.out.println(count);
		System.out.println(words);
		System.out.println(letter);
		
		

	}

}
