package Array;

public class ArrayMin {
public static void main(String[] args) {
	int[] arr= {10,50,40,60,30,3};
	int max=0;
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
		{
			max=arr[i];
		}
	}
	int min=max;
	for(int i=0;i<arr.length;i++)
	{
		if(min>arr[i])
		{
			min=arr[i];
		}
	}
	System.out.println(min);
}
}
