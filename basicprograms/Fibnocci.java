package basicprograms;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int p=0;
		int i=1;
		System.out.print(p+" ");
		while(i<n)
		{
			System.out.print(i+" ");
			int k=i;
			i=i+p;
			p=k;
			
			
		}

	}

}
