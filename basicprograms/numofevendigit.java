package basicprograms;

import java.util.Scanner;

public class numofevendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				count++;
			}
			num=num/10;
			
		}
		System.out.println(count);
		if(count>2)
		{
			System.out.print("TRUE");
		}
		else {
			System.out.print("FALSE");
		}
	}

}
