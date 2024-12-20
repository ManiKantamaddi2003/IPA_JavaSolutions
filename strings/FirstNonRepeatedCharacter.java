package strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbddef";
		Map<Character,Integer>countMap=new LinkedHashMap<>();
		List<Character>ls=new ArrayList<>();
		for(char ch:str.toCharArray())
		{
			countMap.put(ch, countMap.containsKey(ch)?countMap.get(ch)+1:1);
		}
		for(Map.Entry<Character, Integer>entry:countMap.entrySet())
		{
			if(entry.getValue()>1)
			{
				ls.add(entry.getKey());
				
			}
		}
		System.out.println(ls);
		Object[] ch=ls.toArray();
		System.out.println(ch[ch.length-1]);
		

	}

}
