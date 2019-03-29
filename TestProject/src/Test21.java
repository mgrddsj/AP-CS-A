import java.util.Arrays;
import java.util.Random;

public class Test21 
{
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] ints = new int[100];
		for (int i=0; i<99; i++)
		{
			ints[i] = rand.nextInt(10);
		}
		System.out.println(Arrays.toString(ints));
	}
	
}
