package basicprograms;

import java.util.Scanner;

public class revwordsinString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String arr[]=input.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=" ")
			{
			System.out.print(arr[i]+" ");
			}
		}

	}

}
