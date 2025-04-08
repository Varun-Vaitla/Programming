package Frequency;

public class frequency1 {
//	public static void main(String[] args) {
//		String str="aabbbcccccddddd";
//		int[] arr=new int[127];
//		for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			arr[ch]++;
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>0)
//			{
//				System.out.print((char)i+""+arr[i]);
//			}
//		}
//	}
//}
	
	public static void main(String[] args) {
		String str ="a2b3c4d2";
		String str1 = str.replaceAll("[^A-Za-z]","");
		String num = str.replaceAll("[^0-9]", "");
		char [] ch1 = str1.toCharArray();//abc
		char [] ch2 = num.toCharArray();//234
		
		for(int i = 0;i<ch1.length;i++) {
			for(int j =0;j<ch2[i]-48;j++) {
				System.out.print(ch1[i]);
			}
		}
	}
}
//		
//		
//		
//	}
//public static void main(String[] args) {
//	String str="a2b3c3";
//	String str1=str.replaceAll("[^A-Za-z]", "");
//	String num=str.replaceAll("[^0-9]","");
//	char[] ch=str1.toCharArray();//abc
//	char[] ch1=num.toCharArray();//233
//	for(int i=0;i<str1.length();i++)//a,b,c
//	{
//		for(int j=0;j<ch1[i]-48;j++)//2,3,3
//		{
//			System.out.print(ch[i]);//aabbbccc
//		}
//	}
//	
//}
//}
