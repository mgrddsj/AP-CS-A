import java.io.IOException;
import java.util.Scanner;

public class Room7 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Start playing by pressing enter. ");
		in.nextLine();
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		
		System.out.println("Start playing by pressing enter. ");
		in.nextLine();
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		printw(
				"SIMULATION INFO TRANSPORTING AREA\r\n" + 
				"\r\n" + 
				"PASSCODE NEEDED TO TRANSMIT INFORMATION OUTSIDE\r\n");
		
		printw("HACKING.....\r\n");
		wait(2000);
		
		printw("FOUND DOCUMENT AND DATA SNIPPET: \n\n");
		printfast(
				"In the year ____, a group of misanthropist scientists named ¡°______¡± felt that humans were the root \r\n" + 
				"of all problems that are happening right now: global warming, mass extinction of flora and fauna, etc. \r\n" + 
				"They thought that in order to save Earth, humans must be controlled by them in order to make things \r\n" + 
				"right. In order to that, they secretly developed a virus ______ called ¡°______¡±; it targets the pre-frontal \r\n" + 
				"cortex of the brain, making humans not capable of self-control and self-thought. By the time the \r\n" + 
				"government and the WHO had discovered it, it was too late; 99% of the human population has been \r\n" + 
				"infected. Why? The group controlled the people who are infected to ¡°act normal¡± until the whole \r\n" + 
				"population is infected, so that no forces can stop them. There are no effect in first stage infection; you \r\n" + 
				"cannot see any symptoms when infected.\r\n" + 
				"\r\n" + 
				"In order to preserve the rest of the healthy population, the healthy people from all around the world\r\n" + 
				" meet up together to deliver a plan: to send the healthy population to an underground bunker to \r\n" + 
				"isolate them. They plan to ______ made one month ago---it was actually used to cure psychological \r\n" + 
				"diseases, so it simulated an island for the sick to rest. Looks like this is what it is now used. The people \r\n" + 
				"will stay there until the cure is found.\r\n" + 
				"\r\n" + 
				"You are the first 4 people to upload your minds into the simulation. However, no one suspected a mole\r\n" + 
				" in the group: a computer scientist named ¡°_____¡±, a high member of ¡°AC¡±. In order to stop this \r\n" + 
				"effort to eradicate the disease, he installed a virus to the simulation: After 4 people was uploaded in, \r\n" + 
				"their ____ will be erased, and the ¡°island¡± will be changed into an ¡°abandoned building¡±. Then, the \r\n" + 
				"machine will go haywire, preventing others to get in.\r\n" + 
				"\r\n" + 
				"He will trick them into _____ in order to escape¡­ that way, no cure will be found. He has already ordered \r\n" + 
				"the people infected to _____  on Earth.\r\n" + 
				"\n");
		
		printfast(
				"1.    A 2018   B 2020    C 2021  D 2022\r\n" + 
				"2.    N Anthropos Condesendo  O Anthropos Conrumpo  P Animalia Condesendo  Q Animalia Conrumpo\r\n" + 
				"3.    R control people¡¯s minds   S disable the function of their arms  T disable the function of their legs   U cause them to commit suicide\r\n" + 
				"4.    O Teinaire   P Radiore   Q Potoriea  R Poitiore\r\n" + 
				"5.    U upload them into a simulation   V send them into a space station   W stay in the bunker    X transport them into a secret lab\r\n" + 
				"6.    O Edni Yam   P Adna Loy   Q Lola Day   R Snyde Ere\r\n" + 
				"7.    R memories from 1 year ago  S abilities from 1 year ago T memories from 3 years ago   U abilities from 3 years ago\r\n" + 
				"8.    D release a second virus   E destroy the simulation   F commit suicide   G destroy the lab\r\n" + 
				"9.    A kill all the other scientists   B destroy all lab equipment   C destroy all electronic devices and transportation    D destroy all the labs\r\n" + 
				"\n");
		
		password();
		printw(
				"PLEASE TRANSMIT INFO,\r\n" + 
				"CURE INGREDIENTS:");
		ingredient();
		
		Thread.sleep(2000);
		System.out.println("\n\nPlease proceed to next room. ");

		
		wait(10000);
		System.out.println("Press enter to exit. ");
		in.nextLine();
		in.close();
	}

	public static void printw(String text) throws InterruptedException
	{
		for (int i=0;i<=text.length()-1;i++)
		{
			if (text.charAt(i)=='\n')
				Thread.sleep(500);
			System.out.print(text.charAt(i));
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
	
	public static void Hack() throws InterruptedException
	{
		printw("HACK? (Y/N)\n");
		
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
			Hack();
		}
	}
	
	public static void password() throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\nPASSCODE: ");
		String input = in.nextLine();
		if (input.equalsIgnoreCase("corrupted"))
		{
			printw("ACCESS GRANTED.\r\n");
		}

		else 
		{
			printw("Wrong! Try again! ");
			password();
		}
	}
	
	public static void ingredient() throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		int score = 0;
		
		System.out.print("1. ");
		if (in.nextLine().equalsIgnoreCase("Uranium"))
			score++;
		
		System.out.print("2. ");
		if (in.nextLine().equalsIgnoreCase("Mercury"))
			score++;
		
		System.out.print("3. ");
		if (in.nextLine().equalsIgnoreCase("Bone"))
			score++;
		
		System.out.print("4. ");
		if (in.nextLine().equalsIgnoreCase("Wormwood"))
			score++;
		
		System.out.print("5. ");
		if (in.nextLine().equalsIgnoreCase("Zinc"))
			score++;
		
		System.out.print("6. ");
		if (in.nextLine().equalsIgnoreCase("Blood"))
			score++;
		
		printw("TRANSMITTING......\n");
		wait(2000);
		printw("TRANSMITTED. \n");
		System.out.println("ACCURACY: " + score + "/6");
		
		wait(1000);
		printw(
				"ESCAPE CODE: BA515\r\n" + 
				"PLEASE TYPE IN ESCAPE CODE: ");
		while (!in.nextLine().equalsIgnoreCase("BA515"))
			System.out.println("Wrong password! Please try again! ");
		
		System.out.println("Exitting...");
		printw("THANK YOU FOR USING S.I.M. SIMULATION. ");
	}
}
