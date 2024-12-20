package basicprograms;

import java.util.Scanner;

public class countwordsinstring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		//System.out.println(str.length());
//		int count=1;
//		for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			if(ch==' ')
//			{
//				count++;
//			}
//		}
//		System.out.print(count);
		int count=0;
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=" ")
			{
				count++;
			}
		}
		System.out.print(count);

	}

}
