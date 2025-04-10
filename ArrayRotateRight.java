package Array;

public class ArrayRotateRight {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=7;
		    n=n%arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(i<n)
			{
				System.out.println(arr[arr.length+i-n]+" ");
			}else
			{
				System.out.println(arr[i-n]);
			}
		}
		
	}

}
