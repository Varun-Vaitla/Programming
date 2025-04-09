package Array;

public class ArrayPalindron {
	public static void main(String[] args) {
		int [] arr= {10,20,30,20,10,10};
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			if(arr[l]!=arr[r])
			{
				System.out.println("not palindrom");
				return;
			}
			l++;
			r--;
		}
		System.out.println("palindrom");
	}

}
