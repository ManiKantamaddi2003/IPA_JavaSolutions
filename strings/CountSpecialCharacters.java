package strings;

public class CountSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="He##llo";
		int count=0;
		String stri="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		if(Character.isAlphabetic(ch))
		{
			stri=stri+ch;
		}
		}
		System.out.println(stri);

	}

}
