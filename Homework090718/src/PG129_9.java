//Name: Jesse Xu
//Last changed: 09.09.2018
//Description: Problem 9 on pg. 129. 
//Comment: This program is pretty messy. I cannot think of better solutions right now. 
public class PG129_9 
{

	public static void main(String[] args) 
	{
		printDashes();
		for(int strangeThings = 1;strangeThings <= 10;strangeThings++)
		{
			System.out.print("_-^-");
		}
		System.out.println();
		for(int num = 1;num <=9;num++)
		{
			System.out.print(num);
			System.out.print(num);
		}
		System.out.print("00");
		for(int num = 1;num <=9;num++)
		{
			System.out.print(num);
			System.out.print(num);
		}
		System.out.println("00");
		printDashes();
	}

	public static void printDashes()
	{
		for(int dashes = 1;dashes <= 40;dashes++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
}
