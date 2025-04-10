package Array;

import java.util.Arrays;

public class MargeTwoArraySort {
	public static void main(String[] args) {
		int[] arr1= {1,20,40,6,5};
		int[] arr2= {2,14,3,54,55};
		int[] temp=new int[arr1.length+arr2.length];
		int j=0;
		for(int i=0;i<arr1.length;i++)
		{
			temp[j++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			temp[j++]=arr2[i];
		}
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
	}

}
