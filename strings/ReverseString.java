package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		String rev=sb.reverse().toString();
		if(str.equals(rev))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("NOT");
		}

	}

}
