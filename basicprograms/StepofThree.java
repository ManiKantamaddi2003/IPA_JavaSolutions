package basicprograms;

import java.util.Scanner;

public class StepofThree {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int sum=0;
		int count=0;
		for(int i=a;i<b;i++)
		{
			if(i%3==0 && i%2==0)
			{
			System.out.println(i);
			sum=sum+i;
			count++;
			}
			
		}
		System.out.println("Sum: "+sum);
		System.out.println("Count: "+count);
	}
}
