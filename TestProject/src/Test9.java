import java.util.Random;
import java.util.Scanner;

public class Test9 
{

	public static void main(String[] args) 
	{
		averaging();
	}

	public static void averaging()
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("How many numbers you want to average: ");
		int counter=in.nextInt();
		System.out.println("What's the minimum value: ");
		int min=in.nextInt();
		System.out.println("What's the maximum value: ");
		int max=in.nextInt();
		int sum=0;
		
		for (int i=1;i<=counter;i++)
		{
			sum+=(rand.nextInt(max-min) + min);
		}
		
		System.out.println("Average: " + (sum/counter));
		in.close();
	}
}
