package Frequency;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWord {
	public static void main(String[] args) {
		String str="hi this is is this hi";
		Map <String,Integer> m=new HashMap <String,Integer>();
		for(String s1:str.split(" "))
		{
			if(m.containsKey(s1))
			{
				m.put(s1,m.get(s1)+1);
			}
			else
			{
				m.put(s1,1);
			}
		}
		m.forEach((k,v)->{System.out.println(k+" "+v);});

		
	}

}
