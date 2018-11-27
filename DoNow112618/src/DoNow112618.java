import java.util.Random;

public class DoNow112618 
{

	public static void main(String[] args)
	{
		int[] list = new int[500];
		Random rand = new Random();
		int sum = 0;
		for (int i=0;i<list.length;i++)
		{
			list[i] = rand.nextInt(25)-10;
			sum += list[i];
		}
		
		double mean = (double)sum / (double)500;
		double sumOfXMinusMeanOfX = 0;
		
		for (int i=0;i<list.length;i++)
		{
			sumOfXMinusMeanOfX += (list[i]-mean)*(list[i]-mean);
		}
		
		double standardDeviation = Math.sqrt(sumOfXMinusMeanOfX/(list.length-1));
		
		System.out.println("Mean: " + mean);
		System.out.println("Standard deviation: " + standardDeviation); 
	}

}
