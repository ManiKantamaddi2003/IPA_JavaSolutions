package basicprograms;

import java.util.Scanner;

public class VowelsatEvenplaces {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			char ch=word.charAt(0);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
					System.out.println(ch);
			}
		}

	}

}
