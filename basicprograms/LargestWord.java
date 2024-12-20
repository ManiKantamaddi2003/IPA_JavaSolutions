package basicprograms;

import java.util.Scanner;

public class LargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String words[]=str.split(" ");
		int length=words[0].length();
		String s="";
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>length)
			{
				s=words[i];
				
			}
			
			
		}
		System.out.println(s);

	}

}
