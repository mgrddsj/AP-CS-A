//Name: Jesse Xu
//Last changed: 09.09.2018
//Description: Homework problem on pg. 127, problem 35. 

/*
	Guess:
	The result is: 55
*/
//Actual program that can run: 
public class PG127_35 
{
	public static final int MAX = 5;
	
	public static void main(String[] args) 
	{
		unknown();
	}

	public static void unknown()
	{
		int number = 0;
		
		for ( int count = MAX; count >= 1; count--)
		{
			number += (count * count);
		}
		
		System.out.println("The result is: " + number);
	}
}
