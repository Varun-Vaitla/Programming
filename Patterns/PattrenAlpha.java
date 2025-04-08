package Patterns;

public class PattrenAlpha {
	public static void main(String[] args) {
		int n=5;
		char c='a';
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row >=col)
				{
					System.out.print(c++ +" ");
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
