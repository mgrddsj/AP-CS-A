import java.util.Scanner;

public class Room1 
{

	public static void main(String[] args) 
	{
		System.out.println("Are you trapped? ");
		answer(1);
		System.out.println("Are you... you?");
		answer(2);
		System.out.println("Is someone following you? ");
		answer(3);
		System.out.println("Do you want to leave? ");
		answer(1);
		System.out.println("Do you realize the truth? ");
		answer(4);
		System.out.println("Very Well. Please Come In. ");
	}

	public static void answer(int res)
	{
		Scanner in = new Scanner(System.in);
		if (("" + (in.next()).toLowerCase().charAt(0)).equals("y"))
		{
			if (res==3)
			{
				System.out.println("Then you are too dangerous. ");
				restart();
			}
			if (res==4)
			{
				System.out.println("Then why are you here? ");
				restart();
			}
			in.close();
			return;
		}
		else 
		{
			if (res==1)
				System.out.println("Then why are you here? ");
			if (res==2)
				System.out.println("Then come back when you are normal. ");
			restart();
		}
		in.close();
	}
	
	public static void restart()
	{
		System.out.println("Restart? (Y/N)");
		Scanner in = new Scanner(System.in);
		if (("" + (in.next()).toLowerCase().charAt(0)).equals("y"))
			System.exit(0);
		in.close();
	}
}
