import java.util.Arrays;
import java.util.Random;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();

		int[] array = new int[100];
		for (int i=0; i<array.length; i++)
		{
			array[i] = rand.nextInt(100);
		}

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		System.out.println(binarySearch(array, 15));
	}

	public static int binarySearch(int[] array, int numToFind)
	{
		int index=-1;
		boolean found = false;
		int i = array.length/2;
		int count = 2;

		while (!found)
		{
			if (numToFind > array[i])
			{
				i += array.length/(Math.pow(2, count));
				count++;
			}
			else if (numToFind < array[i])
			{
				i -= array.length/(Math.pow(2, count));
				count++;
			}
			else 
			{
				index = i;
				found = true;
			}

			if (array.length/Math.pow(2, count) < 1)
			{
				found = true;
			}
		}
		return index;
	}

}
