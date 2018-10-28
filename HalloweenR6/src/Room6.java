import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
//Need PASSWORD!
public class Room6 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Start playing by pressing enter. ");
		in.nextLine();
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		
		printw(
				"When time stops \r\n" + 
				"When words fade \r\n" + 
				"Only light will guide the way \r\n" + 
				"For it will meet its reflection\r\n" + 
				"Face to face\r\n" + 
				"Hours and minutes\r\n" + 
				"When the Track reveal itself\r\n" + 
				"Lights will find its way");
		
		password();
		
		Thread.sleep(2000);
		System.out.println("\n\nPlease proceed to room 7. ");

		Thread.sleep(10000);
		System.out.println("Press enter to exit. ");
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
			Thread.sleep(25);
		}
	}
	
	public static void printfast(String text) throws InterruptedException
	{
		for (int i=0;i<=text.length()-1;i++)
		{
			if (text.charAt(i)=='\n')
				Thread.sleep(100);
			System.out.print(text.charAt(i));
			Thread.sleep(5);
		}
	}
	
	public static void wait(int time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	
	public static void password() throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\n\nPassword: ");
		String input = in.nextLine();
		if (input.equalsIgnoreCase("31038"))
		{
				accessGranted();
				Thread.sleep(1000);
				hiddenMessage();
		}
		else if (input.equalsIgnoreCase("12581"))
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
		System.out.println("Document from the United Nations: \n");
		printfast(
				"To the General Assembly:\r\n" + 
				"Reminding the danger of the misanthropist (hate-human) organizations named \"Anthropos Conrumpo\";\r\n" + 
				"Acknowledging the disease that they spread is dangerous;\r\n" + 
				"Noting with regret that the WHO didn't notice it on time;\r\n" + 
				"1. Urges every country to escort(send) healthy people into the underground bunker,\r\n" + 
				"    a. Reminding them that the S.I.M. simulation is usable\r\n" + 
				"2. Recommends every country to find a way to upload conscious into simulation,\r\n" + 
				"3. Urges people to stay in the simulation until a cure is found, outside or inside.\n\n");
		
		System.out.println("There's another document from an unknown source, press enter to open it. ");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
		printfast(
				"Adna Loy's diary:\r\n" + 
				"Well. The UN didn't expect that a mole--a betrayer, has been hiding in them the whole time!\r\n" + 
				"As a high member of the AC organization, I will stop them and stop the effort in erasing our\r\n" + 
				"virus away!\r\n" + 
				"Here's my plan: I will upload a virus to the simulation: After 4 people was uploaded in, \r\n" + 
				"their memories for 3 years will be erased, \r\n" + 
				"and the ¡°island¡± will be changed into an ¡°abandoned building. \r\n" + 
				"Then, the machine will go haywire, preventing others to get in.\r\n" + 
				"\r\n" + 
				"I will will trick them into destroying the simulation in order to escape¡­\r\n" + 
				" that way, no cure will be found. I have already ordered the people infected to destroy all labs on Earth.\r\n" + 
				"\r\n" + 
				"No one can stop us now!\n\n");
		
		
	}
	
	public static void hiddenMessage() throws InterruptedException
	{
		printw("You have received a new ingredient: Blood. \n");
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
			if (in.next().equalsIgnoreCase("31038"))
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
