package basicprograms;

import java.util.*;

public class Duplicates_Remover {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		LinkedHashSet lhs=new LinkedHashSet<>();
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			lhs.add(ch);
			
		}
		Object s1[]=lhs.toArray();
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]);
		}
		
		

	}

}
