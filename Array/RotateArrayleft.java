package Array;

public class RotateArrayleft {
	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 4, 5};
	        int n = 7;
	        n = n % arr.length; 

	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[(i + n) % arr.length] + " ");
	        }
	}

}
