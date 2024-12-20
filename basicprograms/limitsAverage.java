package basicprograms;

import java.util.Scanner;

public class limitsAverage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("ENTER LIMITS");
		int limit1=scan.nextInt();
		int limit2=scan.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>limit1 && arr[i]<limit2)
			{
				sum=sum+arr[i];
				count++;
			}
		}
		int avg=sum/count;
		System.out.println(avg);

	}

}
