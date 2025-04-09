package Array;

public class FirstPositiveMissingNo {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8,9};
		int n=arr[arr.length-1];
		int totalsum=n*(n+1)/2;
		int sum=0;
		for(int no:arr)
		{
			sum=sum+no;
		}
		System.out.println("missing no is "+(totalsum-sum));
	}

}
