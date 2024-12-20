package strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String sre=scan.nextLine();
		int count=0;
//		for(int i=0;i<sre.length()-1;i++)
//		{
//			if(sre.charAt(i)==' '&& sre.charAt(i+1)!=' ')
//			{
//				count++;
//			}
//		}
//		if(sre.charAt(0)==' ')
//		{
//		System.out.println(count);
//		}
//		else
//		{
//			System.out.println(count+1);
//		}
		String arr[]=sre.trim().split("\\s+");
		System.out.println(arr.length);
	}

}
