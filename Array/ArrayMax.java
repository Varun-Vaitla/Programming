package Array;

public class ArrayMax {
	public static void main(String[] args) {
		int[] arr= {10,5,24,62,85};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
