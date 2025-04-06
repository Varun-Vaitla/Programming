package Arrays;

public class MissingNumInRange1to9 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7,8,9};
		int n=arr[arr.length-1];
		int sum=0;
		int totalSum=n*(n+1)/2;
		for(int no:arr)
		{
			sum=sum+no;
			
		}
		System.out.println("missing number is "+(totalSum-sum));
	}

}
