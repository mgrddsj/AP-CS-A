import java.util.Random;

public class Random_Average 
{

	public static void main(String[] args) 
	{
		average6();
	}

	public static void average6()
	{
		Random rand = new Random();
		int randNum = 0;
		int sum = 0;
		int count = 0;
		while(randNum!=6)
		{
			randNum = rand.nextInt(12)+3;
			System.out.println(randNum);
			sum += randNum;
			count++;
		}
		System.out.println("Average: " + ((double)sum / (double)count));
	}
}
