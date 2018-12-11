import java.util.Scanner;

public class Contest1_2016_2017 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] list = input.split(", ");

		boolean hasSameSuit = false;
		for (int i=0;i<6;i++)
		{
			
			if (list[i].charAt(1) == list[0].charAt(1))
				hasSameSuit = true;
		}

				
	}

}
