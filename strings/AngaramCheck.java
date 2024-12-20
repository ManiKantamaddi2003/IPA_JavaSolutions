package strings;

public class AngaramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaab";
		String str2="baaa";
		int ch[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			ch[str.charAt(i)]++;
			ch[str2.charAt(i)]--;
		}
		boolean flag=false;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=0)
			{
				flag=true;
				System.out.println("Not Anagram");
				break;
			}
		}
		if(!flag)
		{
		System.out.print("Angaram");
		}
		

	}

}
