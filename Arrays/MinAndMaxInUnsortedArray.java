package Arrays;

import java.util.Arrays;

public class MinAndMaxInUnsortedArray {
	public static void main(String[] args) {
		int[] arr= {10,50,5,60,79,100,6,6};
		Arrays.sort(arr);
		System.out.println(arr[0]+"  is min value in arrray");
		System.out.println(arr[arr.length-1]+" is max value in array");
		
		
	}

}
