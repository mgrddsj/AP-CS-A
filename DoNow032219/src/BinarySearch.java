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
			array[i] = rand.nextInt(1000) - 500;
		}

		Arrays.sort(array);

		System.out.println(binarySearch(array, 35));
	}

	public static int binarySearch(int[] array, int numToFind)
	{
		int index=-1;
		boolean last = true;	//True: last is bigger, False: last is smaller. 
		int loopCount = 0;
		boolean found = false;
		int i = array.length/2;
		int count = 1;

		while (!found)
		{
			if (numToFind > array[i])
			{
				i += array.length/(Math.pow(array.length, count));
				count++;
				if (last == false)
				{
					loopCount++;
				}
				else 
				{
					loopCount = 0;
				}
			}
			else 
			{
				i -= array.length/(Math.pow(array.length, count));
				count++;
				if (last == true)
				{
					loopCount++;
				}
				else 
				{
					loopCount = 0;
				}
			}

			if (loopCount>5)
			{
				break;
			}
		}
		return index;
	}

}
