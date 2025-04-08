package Frequency;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordesMap {
	public static void main(String[] args) {
		String str="hi hello hi hello hello";
		String[] str1=str.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(String s:str1)
		{
			map.put(s,map.getOrDefault(s,0)+1);
		}
		map.forEach((k,v)->{System.out.println(k+" "+v);});
		
		
	}
}
