package Frequency;

public class FrequencyOfCharOnlyMoreThen2 {
	public static void main(String[] args) {
		String str="AabbbcGGc**c@eZ";
		int[] arr=new int[127];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if( ch>='A'&& ch<='Z'||ch>='a'&& ch<='z')
			{
				arr[ch]++;
			}
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=2)
			{
				System.out.println((char)i+" "+arr[i]);
			}
		}
	}
			


}
