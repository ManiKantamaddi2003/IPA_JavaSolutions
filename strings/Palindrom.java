package strings;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Madam";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse().toString().equalsIgnoreCase(str)?"Palindrom":"Not Palindrom");

	}

}
