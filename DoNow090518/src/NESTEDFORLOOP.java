

/*
Guess:
....1
...22
..333
.4444
5555
 */

//The code below is another program. 

public class NESTEDFORLOOP 
{

	public static void main(String[] args) 
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=(5-i);j++)
			{
				System.out.print(".");
			}
			
			
			
			System.out.println();
		}
	}

}
