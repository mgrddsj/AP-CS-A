//Name: Jesse Xu
//Last changed: 09.09.2018
//Description: Problem 7 on pg. 129. 
public class PG129_7 
{

	public static void main(String[] args) 
	{
		for(int i = 1;i <= 5;i++)
		{
			for(int tabs = 5 - i;tabs >= 1;tabs--)
			{
				System.out.print("\t");
			}
			System.out.println(i);
		}
	}

}
