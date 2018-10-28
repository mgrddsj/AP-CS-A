import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class Room5 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Start playing by pressing enter. ");
		in.nextLine();
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		
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
		in.nextLine();
		
		cls();
		System.out.println(
				" \r\n" + 
				"To start on one module:\r\n" + 
				"Type: defuse X (X is the number of the module)\r\n" + 
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
		
		Thread.sleep(5000);
		System.out.println("Please hit enter after finished reading. ");
		in.nextLine();
		
		System.out.println(
				"DELETING CURE INFORMATION:\r\n" + 
				"4 MINUTES LEFT\r\n" + 
				"BOMB DEFUSER PROGRAM START\r\n" + 
				"");
		
		Thread.sleep(2000);
		call();
		
		Thread.sleep(2000);
		System.out.println("\n\nPlease proceed to room 6. ");

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
		int x = 240; // wait 240 seconds at most

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		/*while ((System.currentTimeMillis() - startTime) < x * 1000 && !in.ready()) 
		{
			System.out.println("Time remaining: " + ((240000-(System.currentTimeMillis() - startTime))/1000) + "s");
		}

		if (in.ready()) {
			
		} else {
		    System.out.println("You did not finish it! Bad luck! ");
		}*/
		
		String input = in.readLine();
		while (!input.equalsIgnoreCase("defuse 2")&&!input.equalsIgnoreCase("defuse 7"))
		{
			System.out.println("Failed to select... :(");
			input = in.readLine();
		}
		
		
		
		
		if (input.equalsIgnoreCase("defuse 2"))
		{
			System.out.println("Module 2 Selected. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			while (!in.readLine().equalsIgnoreCase("cut 4"))
			{
				System.out.println("Wrong wire! Time -5s");
				startTime -= 5000;
				System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			}
			System.out.println("Cut. Module Defused. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			press();
			System.out.println("Pressed. Module Defused. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			while (!in.readLine().equalsIgnoreCase("defuse 9"))
			{
				System.out.println("Failed to select. ");
			}
			System.out.println("Module 9 selected. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			while (!in.readLine().equalsIgnoreCase("DRUURURRULULDLDLDLUURUR"))
			{
				System.out.println("Hit wall. Restarting... Time -5s");
				startTime -= 5000;
				System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
				System.out.println("Please input the maze sequence again: ");
			}
			System.out.println("Done. Module Defused. ");
			System.out.println("Time used: " + (System.currentTimeMillis() - startTime)/1000 + "s");
			
			if ((240000-(System.currentTimeMillis() - startTime))>=0)
			{
				printw(
						"Data deleted stopped.\r\n" + 
						"Cure data: Zinc.\r\n" + 
						" \r\n" + 
						"Well done.\r\n" + 
						"But you cannot stop us!\r\n" + 
						"The virus--- the virus that can control peoples' minds;\r\n" + 
						"the virus that delete any thought;\r\n" + 
						"has already spread.\r\n" + 
						"You cannot stop us!\r\n" + 
						"---Anthropos Conrumpo\r\n" + 
						"\n");
			}
			else 
			{
				System.out.println("Sorry, you didn't finish in time. ");
			}
		}
		
		//version B start
		if (input.equalsIgnoreCase("defuse 7"))
		{
			System.out.println("Module 7 Selected. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			while (!in.readLine().equalsIgnoreCase("cut 4"))
			{
				System.out.println("Wrong wire! Time -5s");
				startTime -= 5000;
				System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			}
			System.out.println("Cut. Module Defused. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			press2();
			System.out.println("Pressed. Module Defused. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			while (!in.readLine().equalsIgnoreCase("defuse 1"))
			{
				System.out.println("Failed to select. ");
			}
			System.out.println("Module 1 selected. ");
			System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
			
			while (!in.readLine().equalsIgnoreCase("RRRDRURDDLDLLDRRDRRRRUURD"))
			{
				System.out.println("Hit wall. Restarting... Time -5s");
				startTime -= 5000;
				System.out.println("Time left: " + (240000-(System.currentTimeMillis() - startTime))/1000 + "s");
				System.out.println("Please input the maze sequence again: ");
			}
			System.out.println("Done. Module Defused. ");
			System.out.println("Time used: " + (System.currentTimeMillis() - startTime)/1000 + "s");
			
			if ((240000-(System.currentTimeMillis() - startTime))>=0)
			{
				printw(
						"Data deleted stopped.\r\n" + 
						"Cure data: Zinc.\r\n" + 
						" \r\n" + 
						"Well done.\r\n" + 
						"But you cannot stop us!\r\n" + 
						"The virus--- the virus that can control peoples' minds;\r\n" + 
						"the virus that delete any thought;\r\n" + 
						"has already spread.\r\n" + 
						"You cannot stop us!\r\n" + 
						"---Anthropos Conrumpo\r\n" + 
						"\n");
			}
			else 
			{
				System.out.println("Sorry, you didn't finish in time. ");
			}
		}
		//end
	}
	
	public static void press() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(!in.readLine().equalsIgnoreCase("defuse 6"))
		{
			System.out.println("You cannot do that! ");
		}
		System.out.println("Module 6 selected. ");
		
		if (!in.readLine().equalsIgnoreCase("Press 3"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press();
			return;
		}
		if (!in.readLine().equalsIgnoreCase("Press 2"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press();
			return;
		}
		if (!in.readLine().equalsIgnoreCase("press 4"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press();
			return;
		}
		if (!in.readLine().equalsIgnoreCase("press 1"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press();
			return;
		}
		
	}
	
	public static void press2() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(!in.readLine().equalsIgnoreCase("defuse 4"))
		{
			System.out.println("You cannot do that! ");
		}
		System.out.println("Module 4 selected. ");
		
		if (!in.readLine().equalsIgnoreCase("Press 2"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press2();
			return;
		}
		if (!in.readLine().equalsIgnoreCase("Press 4"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press2();
			return;
		}
		if (!in.readLine().equalsIgnoreCase("press 3"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press2();
			return;
		}
		if (!in.readLine().equalsIgnoreCase("press 1"))
		{
			System.out.println("Wrong button. You need to select the module again. ");
			press2();
			return;
		}
		
	}
}
