package Arrays;

public class PalindromArray {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,20,10};
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]!=arr[j])
			{
				System.out.println(" Not palindrom");
				return;
			}
			i++;
			j--;
			
		}
		System.out.println("palindrom");
		
	}

}
