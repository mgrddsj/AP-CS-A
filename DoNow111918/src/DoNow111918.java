import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class DoNow111918 
{

	public static void main(String[] args) 
	{
		
	}

	public static void average15()
	{
		Scanner in = new Scanner(System.in);
		double[] num = new double[15];
		for (int i=0;i<15;i++)
		{
			System.out.print("Input number " + i + ": ");
			num[i] = in.nextDouble();
		}
		
		System.out.println("Average value: " + Arrays.stream(num).average());
		
		System.out.println("Biggest number: " + Arrays.stream(num).max());
		
		System.out.println("Number of numbers larger than average: " + numLargerThanAvg(num));
		
		System.out.println("Number of odd numbers: " + oddNum(num));
	}
	
	public static int numLargerThanAvg(double[] num)
	{
		double avg = Arrays.stream(num).average().getAsDouble();
		int count = 0;
		for (int i=0;i<15;i++)
		{
			if (num[i]>avg)
				count++;
		}
		return count;
	}
	
	public static int oddNum(double[] num)
	{
		int count = 0;
		for (int i=0;i<15;i++)
		{
			if (num[i]%2==1)
				count++;
		}
		return count;
	}
}
