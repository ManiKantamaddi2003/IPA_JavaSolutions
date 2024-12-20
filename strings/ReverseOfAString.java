package strings;

import java.util.Map;
import java.util.TreeMap;

public class ReverseOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbccddeefffggghhhiiijjjkkk";
//		StringBuffer sb=new StringBuffer(str);
//		String s=sb.reverse().toString();
//		System.out.println(s);
		String words[]=str.trim().split("\\s+");
		Map<Character,Integer>coun=new TreeMap<>();
		for(char ch:str.toCharArray())
		{
			coun.put(ch, coun.containsKey(ch)?coun.get(ch)+1:1);
			
		}
		System.out.println(coun);
		for(Map.Entry<Character,Integer>entry:coun.entrySet())
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		
	}

}
