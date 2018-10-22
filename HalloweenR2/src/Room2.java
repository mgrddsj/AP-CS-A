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
		
		System.out.println("Password: ");
		String input = in.nextLine();
		 
		
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
}
