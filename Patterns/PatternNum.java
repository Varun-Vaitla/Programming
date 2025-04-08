package Patterns;

public class PatternNum {
	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(row>=col)
				{
					if(k>1 && k<10)
					{
						System.out.print(k++ +"  ");
					}
					else
					{
						System.out.print(k++ +" ");
					}
					
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
