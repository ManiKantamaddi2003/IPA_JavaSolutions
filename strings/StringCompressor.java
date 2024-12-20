package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringCompressor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbccccdddddee";
		LinkedHashMap<Character,Integer>lhs=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			lhs.put(ch,lhs.getOrDefault(ch,0)+1);
		}
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<Character, Integer> entry:lhs.entrySet())
		{
			sb.append(entry.getKey()).append(entry.getValue());
		}
		System.out.print(sb);
	}

}
