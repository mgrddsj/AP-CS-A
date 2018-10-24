import java.util.Random;
import java.util.Scanner;

public class Room4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		printw(
				"Tick tock.\r\n" + 
				"Time is ticking.\r\n" + 
				"Dates are flying away.\r\n" + 
				"Memories written has scattered.\r\n" + 
				"Linking them is the only choice.\r\n" + 
				"Where in the calendar?\r\n" + 
				"Where are we goinshsgsbwhgsbshgsvsbysgwbwhgsbsjydbsjkwo\r\n" + 
				"...\r\n");
		wait(2000);
		printw(
				"HACKING PREVENTED\r\n" + 
				"PLEASE REENTER PASSWORD\r\n");
		printw(
				"HINT: WRITTEN MEMORIES ON BOOKS RECORDING DAYS\r\n" + 
				"*SJHmatchJHHBGFtheJAGABGGyearsHGFofHJBcode*");
		
		wait(2000);
		password();
		
		System.out.println("\n\nPlease proceed to next room. ");
		
		wait(10000);
		System.out.println("Press enter to exit. ");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		in.close();
		
	}

	public static void printw(String text) throws InterruptedException
	{
		for (int i=0;i<=text.length()-1;i++)
		{
			if (text.charAt(i)=='\n')
				Thread.sleep(150);
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
		if (input.equalsIgnoreCase("2021"))
		{
				accessGranted();
				Thread.sleep(1000);
				hiddenMessage();
		}
		else if (input.equalsIgnoreCase("time"))
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
		System.out.println("Decrypting...");
		wait(2000);
		printw(
				"Access Granted.\r\n" + 
				"Welcome, professor Nicholas He Sr.\r\n" + 
				"It is now October 31st, 2021.\r\n" + 
				"The year is 2021. \n");
	}
	
	public static void hiddenMessage() throws InterruptedException
	{
		printw("You have received a new ingredient: Wormwood. \n");
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
			if (in.next().equalsIgnoreCase("2021"))
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
