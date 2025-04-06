package Arrays;

public class MaxEleInArrayWithOutSort {
	public static void main(String[] args) {
		int[] arr= {5,10,7,0,90,45,1,35};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
