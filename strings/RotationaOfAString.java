package strings;

public class RotationaOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		String str2="bcda";
		System.out.println(isRootated(str, str2));

	}
	public static boolean isRootated(String str,String str2)
	{
		if(str==null || str2==null)
		{
			return false;
		}
		else if(str.length()!=str2.length())
		{
			return false;
		}
		else
		{
			String conc=str+str;
			return conc.contains(str2);
			
		}
	}

}
