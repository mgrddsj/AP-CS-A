import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Room5 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		printw(
				"Hi there!\r\n" + 
				"See the two things on the table?\r\n" + 
				"Do you like our gift?\r\n" + 
				"I'm sure it will BLOW YOUR MIND!\r\n" + 
				"----\r\n" + 
				"*&88tHiS iS tHe OnLy WaY tO GeT ThE InFo\r\n" + 
				"Get tHe CuRe : UnDeR 4 MiNuTeS*^^&^&*^&&*\r\n" + 
				"---\r\n" + 
				"hUH?\r\n" + 
				"Well, someone wants to help.\r\n" + 
				"Well, let them.\r\n" + 
				"I'm sure you will not solve this!!!\r\n" + 
				"\n");
		
		System.out.println("Press enter to continue. ");
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
		cls();
		System.out.println(
				" \r\n" + 
				"To start on one module:\r\n" + 
				"Type: defuse module X (X is the number of the module)\r\n" + 
				" \r\n" + 
				"THE WIRE MODULE:\r\n" + 
				"To cut a wire:\r\n" + 
				"Type: cut X (X is the number of the wire: from top to bottom)\r\n" + 
				" \r\n" + 
				"THE SYMBOL MODULE:\r\n" + 
				"To press a button:\r\n" + 
				"Type: press X (X is the number of the button)\r\n" + 
				" \r\n" + 
				"THE MAZE:\r\n" + 
				"To move:\r\n" + 
				"Type: l, r, u, d\r\n" + 
				"(l for left, r for right, u for up, d for down)\r\n" + 
				"\n");
		
		System.out.println("Please hit enter after finished reading. ");
		in.nextLine();
		
		System.out.println(
				"DELETING CURE INFORMATION:\r\n" + 
				"4 MINUTES LEFT\r\n" + 
				"BOMB DEFUSER PROGRAM START\r\n" + 
				"");
		
		Thread.sleep(3000);
		call();
		
		
		
	}

	public static void printw(String text) throws InterruptedException
	{
		for (int i=0;i<=text.length()-1;i++)
		{
			if (text.charAt(i)=='\n')
				Thread.sleep(100);
			System.out.print(text.charAt(i));
			Thread.sleep(30);
		}
	}
	
	public static void cls() throws InterruptedException, IOException
	{
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	
	public static void call() throws IOException, InterruptedException
	{
		int x = 180; // wait 180 seconds at most

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		String input = "";
		while ((System.currentTimeMillis() - startTime) < x * 1000 && !in.ready()) 
		{
			cls();
			System.out.println("Time remaining: " + ((180000-(System.currentTimeMillis() - startTime))/1000) + "s");
			System.out.println("Command: " + input);
			Thread.sleep(999);
		}

		if (in.ready()) {
		    input += in.read();
		    in.reset();
		} else {
		    System.out.println("You did not finish it! Bad luck! ");
		}
	}
}
