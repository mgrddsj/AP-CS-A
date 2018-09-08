//Name: Jesse Xu
//Last changed: 09.09.2018
//Description: Problem 16 on pg. 130. 
public class PG130_16 
{
	
	public static void main(String[] args) 
	{
		for(int i = 1;i <= 5;i++)
		{
			for(int slashes = i - 1;slashes >= 1;slashes--)
			{
				System.out.print("\\\\");
			}
			for(int exclamation = 6 - i;exclamation >=0;exclamation--)
			{
				System.out.print("!!");
			}
			for(int exclamation = 6 - i;exclamation >=0;exclamation--)
			{
				System.out.print("!!");
			}
			for(int invertedSlashes = i - 1;invertedSlashes >= 1;invertedSlashes--)
			{
				System.out.print("//");
			}
			System.out.println();
		}
	}
	
}
