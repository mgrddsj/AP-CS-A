import java.util.Arrays;

public class RecursiveFunction 
{

	public static void main(String[] args) 
	{
		int[] array = {1, 3, 5, 7};
		System.out.println(Arrays.toString(array));
		printReversely(array, 0);
	}

	public static void printReversely(int[] array, int i)
	{
		if (i < array.length-1)
		{
			printReversely(array, i+1);
		}
		System.out.print(array[i] + " ");
	}

}
