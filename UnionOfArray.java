package Array;

import java.util.TreeSet;

public class UnionOfArray {
	public static void main(String[] args) {
		int[] arr1= {1,2,2,3,4,5};
		int[] arr2= { 6,7,8,8,9,8,10};
		TreeSet<Integer> t1=new TreeSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			t1.add(arr1[i]);	
		}
		for(int i=0;i<arr2.length;i++)
		{
			t1.add(arr2[i]);
		}
		System.out.println(t1);
	}

}
