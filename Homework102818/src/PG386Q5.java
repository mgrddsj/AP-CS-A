//This is not the best solution for Rock Paper Scissors Games, 
//I just wrote it as it flows in my mind. 
//There could be more succinct solutions, and this is a modularized one. 
//Also, I haven't make it "smart" based on history. 
//Actually, we can make a fake one that just outputs "you win", "you lose" or "tie" randomly lol. 

import java.util.Random;
import java.util.Scanner;

public class PG386Q5 
{

	public static void main(String[] args) 
	{		
		while (true)
		{
			System.out.println("What's your choice? (r=rock / p=paper / s=scissors)");
			printResults(judge(userChoice(),computerRandom()));
		}
	}

	public static int userChoice()
	{
		Scanner in = new Scanner(System.in);
		String input = " ";
		while (input.charAt(0)!='r'&&input.charAt(0)!='p'&&input.charAt(0)!='s')
		{
			System.out.println("(Please only input r/p/s)");
			input = in.next();
		}
		if (input.charAt(0)=='r')
		{
			return 0;
		}
		else if (input.charAt(0)=='p')
		{
			return 1;
		}
		else 
			return 2;
	}
	
	public static int computerRandom()
	{
		Random rand = new Random();
		return rand.nextInt(3);
	}
	
	public static int judge(int human,int computer) 
	{
		if (human==0)
		{
			if (computer==1)
				return 1;
			else if (computer==2)
				return 2;
			else 
				return 0;
		}
		else if (human==1)
		{
			if (computer==0)
				return 2;
			else if (computer==2)
				return 1;
			else 
				return 0;
		}
		else 
		{
			if (computer==0)
				return 1;
			else if (computer==1)
				return 2;
			else 
				return 0;
		}
	}
	
	public static void printResults(int result)
	{
		if (result==1)
			System.out.println("Computer wins! ");
		else if (result==2)
			System.out.println("You win! ");
		else 
			System.out.println("Tie! ");
	}
}
