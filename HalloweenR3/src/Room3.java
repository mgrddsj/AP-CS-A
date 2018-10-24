import java.util.Random;
import java.util.Scanner;

public class Room3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		printw(
				"Flicker.\r\n" + 
				"The lights went out.\r\n" + 
				"Then it went on.\r\n" + 
				"Out. On. Off. On.\r\n" + 
				"A neverending loop.\r\n" + 
				"Find the hidden pathway to escape the neverending loop.\r\n" + 
				"Map is in the darkness, yet reality is light.\r\n" + 
				"Use them. Then it has fufilled its value.\n");
		wait(2000);
		password();
		
		System.out.println("\n\nPlease proceed to next room. ");
		
		wait(10000);
		System.out.println("Press enter to exit. ");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
	}

	public static void printw(String text) throws InterruptedException
	{
		for (int i=0;i<=text.length()-1;i++)
		{
			if (text.charAt(i)=='\n')
				Thread.sleep(100);
			System.out.print(text.charAt(i));
			Thread.sleep(50);
		}
	}
	
	public static void wait(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	
	public static void password() throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\nPassword: ");
		String input = in.nextLine();
		if (input.equalsIgnoreCase("HARD"))
		{
			accessGranted();
			Thread.sleep(1000);
			hiddenMessage();
		}
		else if (input.equalsIgnoreCase("EASY"))
			{
				accessGranted();
				wait(2000);
				advancePassword();
			}
		else 
		{
			printw("Wrong! Try again! ");
			password();
		}
	}
	
	public static void accessGranted() throws InterruptedException
	{
		printw(
				"Command received.\r\n" + 
				"Hacking...\r\n" + 
				"ERROR ERROR\r\n" + 
				"SYSTEM HAS REACHED AN ERROR\r\n" + 
				"RESTARTING...\r\n" + 
				"...\r\n");
		wait(2000);
		printw(
				"SIMULATION VER 2.0 STUCK IN MEMORIES(SIM)\r\n" + 
				"WELCOME.\r\n" + 
				"PLEASE ENJOY YOUR STAY IN THE VIRTUAL WORLD.\r\n" + 
				"PLEAS PROCEED.");
	}
	
	public static void hiddenMessage() throws InterruptedException
	{
		randomBinaries();
		printw(
				"ingredient.get(bone)\r\n" + 
				"bone = ingredient");
	}
	
	public static void randomBinaries() throws InterruptedException
	{
		Random rand = new Random();
		for (int a=1;a<=10;a++)
		{
			for (int i=1;i<=100;i++)
			{
				System.out.print(rand.nextInt(2));
				Thread.sleep(2);
			}
			System.out.println();
		}
	}
	
	public static void advancePassword() throws InterruptedException
	{
		wait(1000);
		printw("\n\nThere's an advanced password. You have 5 chances to try it. \n");
		Scanner in = new Scanner(System.in);
		
		for (int trials=1;trials<=5;trials++)
		{
			System.out.print("Password: ");
			if (in.next().equalsIgnoreCase("HARD"))
			{
				hiddenMessage();
				break;
			}
			else
			{
				if (trials!=5)
					printw("Wrong! Try again! You have " + (5-trials) + " more chances. \n");
				else 
					printw("Wrong! Access denied! \n");
			}
		}
	}
}
