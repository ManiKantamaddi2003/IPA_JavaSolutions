package basicprograms;

import java.util.Scanner;

public class ReverseofaNumber {

	private static int vowelcount;
	private static int consonentcount;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int number=scan.nextInt();
//		while(number>0)
//		{
//			int rem=number%10;
//			System.out.print(rem);
//			number/=10;
//		}
		
		//String str=scan.nextLine().toUpperCase();
//		for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			if(Character.isAlphabetic(ch))
//			{
//				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
//				{
//					
//					vowelcount++;
//				}
//				else
//				{
//					consonentcount++;
//				}
//			}
//		
//		}
//		System.out.println("Vowel Count: "+vowelcount);
//		System.out.println("Consonent Count: "+consonentcount);

		
		
		
//		
//		
//		
//		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			char ch=str.charAt(i);
//			if(Character.isAlphabetic(ch))
//			{
//				System.out.print(ch);
//			}
//		}
//		
//		
		
		 int number=scan.nextInt();
		 int temp=number;
		 int count=0;
		 int result=0;
		 while(temp>0)
		 {
			 temp/=10;
			 ++count;
		 }
		  temp=number;
		 while(temp>0)
		 {
			 int rem=temp%10;
			 result+=Math.pow(rem,count);
			 temp/=10;
			 
		 }
		 if(result==number)
		 {
			 System.out.println("ArmStrong");
		 }
		 else
		 {
			 System.out.println("Not");
		 }
	
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
