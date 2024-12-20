package basicprograms;

import java.util.Scanner;

public class odd_index_character {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				System.out.print(str.charAt(i));
			}
		}

	}

}
