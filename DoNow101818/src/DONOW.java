import java.util.Random;
import java.util.Scanner;

public class DONOW 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int sum = 0;
		int errors = 0;
		int points = 0;
		Scanner in = new Scanner(System.in);
		while (errors<3)
		{
			int times = rand.nextInt(4)+2;
			for (int i =1;i<=times;i++)
			{
				int num = rand.nextInt(10)+1;
				if (i!=times)
					System.out.print(num + " + ");
				else 
					System.out.print(num + " = ");
				sum += num;
			}
			int answer = in.nextInt();
			if (answer == sum)
			{
				points++;
			}
			else 
			{
				errors++;
				System.out.println("Wrong!!! The answer was " + sum);
			}
			sum = 0;
		}
		System.out.println("You earned " + points + " points. " );
		in.close();
	}

}
