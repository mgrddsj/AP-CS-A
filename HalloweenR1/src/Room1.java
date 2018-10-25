import java.util.Random;
import java.util.Scanner;

public class Room1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Instructions: \nTo answer Yes, type 1, \nTo answer No, type 0. \n\n\n");
		Thread.sleep(5000);
		
		System.out.println("Are you trapped? ");
		answer(1);
		System.out.println("Are you... yourself? ");
		answer(2);
		System.out.println("Is someone following you? ");
		answer(3);
		System.out.println("Do you want to leave? ");
		answer(5);
		System.out.println("Do you realize the truth? ");
		answer(4);
		System.out.println("Very Well. Please Come In. ");
		
		System.out.println("Password: ");
		passwordVerification();
		
		randomBinaries();
		
		trapped();
		
		Thread.sleep(5000);
		printw("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		printw("Please proceed. ");
		Thread.sleep(1000);
		printw("\nReset Password. \n");
		
		newpw();
		
		Thread.sleep(2000);
		printw("Please proceed to next room\n");
		
		Thread.sleep(10000);
		System.out.println("Press enter to exit. ");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		in.close();
		
	}

	public static void answer(int res)
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		while (!input.matches("[0-1]+"))
		{
			System.out.println("Please input only 0 or 1! ");
			input = in.nextLine();
		}
		if (Integer.parseInt(("" + (input).charAt(0))) == 1)
		{
			if (res==3)
			{
				System.out.println("\nThen you are too dangerous. ");
				System.out.println("Is someone following you?");
				answer(3);
			}
			if (res==4)
			{
				System.out.println("\nThen why are you here? ");
				System.out.println("Do you realize the truth? ");
				answer(4);
			}
			return;
		}
		else 
		{
			if (res==1)
			{
				System.out.println("\nThen why are you here? ");
				System.out.println("Are you trapped? ");
				answer(1);
			}
			if (res==2)
			{
				System.out.println("\nThen come back when you are normal. ");
				System.out.println("Are you... yourself?");
				answer(2);
			}
			if (res==5)
			{
				System.out.println("\nThen why are you here? ");
				System.out.println("Do you want to leave? ");
				answer(5);
			}
		}
	}
	
	/*	
	public static void restart()
	{
		System.out.println("Restart? (Y/N)");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if (Integer.parseInt(("" + (input).toLowerCase().charAt(0))) == 1)
			System.exit(0);
	}
	*/
	
	public static void passwordVerification()
	{
		int password = 11010;
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		while (!input.matches("[0-1]+"))
		{
			System.out.println("Please input only 0 or 1! ");
			input = in.nextLine();
		}
		if (Integer.parseInt(input) != password)
		{
			System.out.println("\nWrong password! \nPassword: ");
			passwordVerification();
		}
	}
	
	public static void randomBinaries() throws InterruptedException
	{
		Random rand = new Random();
		for (int a=1;a<=30;a++)
		{
			for (int i=1;i<=100;i++)
			{
				System.out.print(rand.nextInt(2));
				Thread.sleep(2);
			}
			System.out.println();
		}
	}
	
	public static void trapped() throws InterruptedException
	{
		String trap = "\n\n\n...\nU R TRAPPED! ";
		for (int i=0;i<=trap.length()-1;i++)
		{
			System.out.print(trap.charAt(i));
			Thread.sleep(300);
		}
	}
	
	public static void printw(String text) throws InterruptedException
	{
		for (int i=0;i<=text.length()-1;i++)
		{
			System.out.print(text.charAt(i));
			Thread.sleep(10);
		}
	}
	
	public static void newpw() throws InterruptedException
	{
		printw("Password has reset, \n");
		System.out.println("0 = 0\n1=1\n2 = 10\n");
		printw("You have 5 chances to try the new password(optional)\n");
		for (int trials=1;trials<=5;trials++)
		{
			if (inputForPW() == 26)
			{
				printw("Password verified! \nIngredient received: Uranium\n");
				break;
			}
			else 
			{
				if (trials == 5)
					System.out.println("Wrong! Access denied! ");
				else 
					System.out.println("Wrong! Try again! You have " + (5-trials) + " more chances. ");
			}
		}
	}
	
	public static int inputForPW()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Password: ");
		String input = in.nextLine();
		while (!input.matches("[0-9]+"))
		{
			System.out.println("Please only input numbers");
			input = in.nextLine();
		}
		int result = Integer.parseInt(input);
		return result;
	}
}
