package Frequency;

public class FrequencyOfOnlyUppercaseChar {
	public static void main(String[] args) {
		String str="AabbcGGc**c@eZ";
		int[] arr=new int[127];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if( ch>='A'&& ch<='Z')
			{
				arr[ch]++;
			}
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				System.out.println((char)i+" "+arr[i]);
			}
		}
	}
			
		


}
