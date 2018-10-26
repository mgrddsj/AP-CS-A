import java.io.IOException;
import java.util.Scanner;

public class Room2 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Start playing by pressing enter. ");
		in.nextLine();
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		printw("Welcome. \n");
		wait(500);
		printw("Media are full of lies.\r\n" + 
				"They even mess up time.\r\n" + 
				"Find the truth beneath the lies.\r\n" + 
				"Lies are often made at the same time.\r\n\n" + 
				"Even the truth have white lies.\r\n" + 
				"Find the lies in the truth.\r\n" + 
				"Some are added. Some are deleted.\r\n\n" + 
				"Even the obvious can have secrets.\r\n" + 
				"");
		
		Thread.sleep(1000);
		password();
		
		System.out.println("\nPlease proceed to room 3. ");
		
		wait(10000);
		System.out.println("Press enter to exit. ");
		in.nextLine();
		
	}

	public static void printw(String text) throws InterruptedException
	{
		for (int i=0;i<=text.length()-1;i++)
		{
			System.out.print(text.charAt(i));
			Thread.sleep(50);
		}
	}
	
	public static void wait(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	
	public static void accessGranted() throws InterruptedException
	{
		printw("Access Granted.\r\n" + 
				"Accessing Document...\r\n");
		Thread.sleep(2000);
		printw("Report from World Health Organization:\r\n" + 
				"The virus ¡°Poitiore¡± has spread out into the entire world. \n" + 
				"It has affected over 80% of the population.\n" + 
				"We are trying to Find the cure.\r\n" + 
				"");
	}
	
	public static void hiddenMessage() throws InterruptedException
	{
		printw("\nHidden Message Granted...\r\n");
		Thread.sleep(2000);
		voicemail();
	}
	
	public static void voicemail() throws InterruptedException
	{
		printw("You have one voicemail. Answer?(Y/N)\r\n");
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		while (!input.matches("[y|n|Y|N]+"))
		{
			System.out.println("Please only input Y or N");
			input = in.nextLine();
		}
		if (("" + input.charAt(0)).equalsIgnoreCase("n"))
		{
			Thread.sleep(500);
			printw(". . . \n");
			Thread.sleep(1000);
			voicemail();
		}
		if (("" + (input.charAt(0))).equalsIgnoreCase("y"))
		{
			printw("Congratulations on your recent beeakthrough of the cure. \nThe ingredient of Mercury, a chemical element, has been proven. \nGood job. ");
		}
	}
	
	public static void advancePassword() throws InterruptedException
	{
		wait(1000);
		printw("\nThere's an advanced password. You have 5 chances to try it. \n");
		Scanner in = new Scanner(System.in);
		
		for (int trials=1;trials<=5;trials++)
		{
			System.out.print("Password: ");
			if (in.next().equalsIgnoreCase("plague"))
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
	
	public static void password() throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\nPassword: ");
		String input = in.nextLine();
		if (input.equalsIgnoreCase("plague"))
		{
			accessGranted();
			Thread.sleep(1000);
			hiddenMessage();
		}
		else if (input.equalsIgnoreCase("disease"))
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
}
