package Patterns;

public class P8 {
	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row<=col)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int row=2;row<=n;row++)
		{
			for(int col=n;col>=1;col--)
			{
				if(row>=col)
				{
					System.out.print("* ");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
