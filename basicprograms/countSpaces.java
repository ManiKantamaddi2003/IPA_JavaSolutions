package basicprograms;

import java.util.Scanner;

public class countSpaces {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		if(count<=3)
		{
			System.out.println("NAN");	
		}
		else {
			System.out.println(count);
		}

	}

}
