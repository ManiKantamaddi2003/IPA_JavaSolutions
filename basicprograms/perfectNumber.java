package basicprograms;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(temp==sum)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("not");
		}

	}

}
