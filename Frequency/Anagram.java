package Frequency;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="varun";
	String str2="arrnv";
	if(str1.length()==str2.length())
	{
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println(" not anagram");
		}
}
	else
	{
		System.out.println("not anagram");
	}
	
}
}
