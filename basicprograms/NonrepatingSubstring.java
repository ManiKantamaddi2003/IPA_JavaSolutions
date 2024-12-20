package basicprograms;

import java.util.Scanner;

public class NonrepatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String s="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==j)
				{
					s=s+str.charAt(i);
				}
				else
				{
					if(str.charAt(i)==str.charAt(j))
					{
						
						count++;
						break;
					}
				}
				if(count>0)
				{
					break;
				}
			}
		}
		System.out.println(s);

	}

}
