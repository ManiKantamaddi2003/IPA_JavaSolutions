package basicprograms;

import java.util.Scanner;

public class SumDivisiblebyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		int sum=0;
		while(input>0)
		{
			int rem=input%10;
			sum=sum+rem;
			input/=10;
		}
		if(sum%3==0)
		{
			System.out.println("TRUE");
			
		}
		else
		{
			System.out.println("False");
		}

	}

}
