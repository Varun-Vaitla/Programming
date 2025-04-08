package Frequency;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingMap {
	public static void main(String[] args) {
		String str="aabbbassccc";
		Map <Character,Integer> m=new HashMap <Character,Integer>();
		for(char ch:str.toCharArray())
		{
			if(m.containsKey(ch))
			{
				m.put(ch,m.get(ch)+1);
			}
			else
			{
				m.put(ch,1);
			}
		}
		m.forEach((k,v)->{System.out.println(k+" "+v);});

		
	}
	
}
