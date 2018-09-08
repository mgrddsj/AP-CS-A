//Name: Jesse Xu
//Last changed: 09.09.2018
//Description: Problem 8 on pg. 129. 
public class PG129_8 
{

	public static void main(String[] args) 
	{
		for(int i = 1;i <=5;i++)
		{
			for(int spaces = 4 - i;spaces >= 0;spaces--)
			{
				System.out.print(" ");
			}
			
			for(int num = i;num >= 1;num--)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
