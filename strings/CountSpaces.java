package strings;

public class CountSpaces {
	public static void main(String args[])
	{
		String str="hii     ra    hello";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
