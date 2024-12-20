package strings;

import java.util.HashSet;
import java.util.Set;

public class PangaramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="The quick brown fox jumps over the lazy dog";
		Set<Character>set=new HashSet<>();
		for(int i=0;i<sentence.length();i++)
		{
			char ch=sentence.charAt(i);
			if(ch>='a' && ch<='z')
			{
				set.add(ch);
			}
		}
		if(set.size()==26)
		{
			System.out.println("Pangaram");
		}

	}

}
