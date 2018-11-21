import java.util.Arrays;
import java.util.Random;

public class DoNow112118 
{

	public static void main(String[] args) 
	{
		arrayPrac();
	}

	public static void arrayPrac()
	{
		int[] array = new int[50];
		Random rand = new Random();
		
		for (int i=0;i<50;i++)
		{
			array[i] = rand.nextInt(35)+10;
			if (array[i]>25 && array[i]<35)
				array[i] = 10;
		}
		
		if (Arrays.stream(array).sum() > 130)
			array[49] = 10;
	}
}
