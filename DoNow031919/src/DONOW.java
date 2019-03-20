import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DONOW 
{

	public static void main(String[] args) 
	{
		int[] array1 = new int[25];
		ArrayList<Integer> list1 = new ArrayList<>();

		fillRandomlyArray(array1);
		fillRandomlyArrayList(list1, 25);

		System.out.println(Arrays.toString(array1));
		System.out.println(list1);

		swapArray(array1, 1, 2);
		swapArrayList(list1, 1, 2);

		System.out.println(Arrays.toString(array1));
		System.out.println(list1);

		selectionSortArray(array1);
		System.out.println(Arrays.toString(array1));

		selectionSortArrayList(list1);
		System.out.println(list1);
	}

	public static void fillRandomlyArray(int[] array)
	{
		Random rand = new Random();
		for (int i=0; i<array.length; i++)
		{
			array[i] = rand.nextInt(31) - 15;
		}
	}

	public static void fillRandomlyArrayList(ArrayList<Integer> list, int r)
	{
		Random rand = new Random();
		for (int i=0; i<r; i++)
		{
			list.add(rand.nextInt(31) - 15);
		}
	}

	public static void swapArray(int[] array, int index1, int index2)
	{
		int temp = array[index2];
		array[index2] = array[index1];
		array[index1] = temp;
	}

	public static void swapArrayList(ArrayList<Integer> list, int index1, int index2)
	{
		int temp = list.get(index2);
		list.set(index2, list.get(index1));
		list.set(index1, temp);
	}

	public static void selectionSortArray(int[] array)
	{
		for (int i=0; i<array.length; i++)
		{
			swapArray(array, i, minArrayIndex(array, i));
		}
	}

	public static void selectionSortArrayList(ArrayList<Integer> list)
	{
		for (int i=0; i<list.size(); i++)
		{
			swapArrayList(list, i, minArrayListIndex(list, i));
		}
	}

	public static int minArrayIndex(int[] array, int startIndex)
	{
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i=startIndex; i<array.length; i++)
		{
			if (array[i]<min)
			{
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static int minArrayListIndex(ArrayList<Integer> list, int startIndex)
	{
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i=startIndex; i<list.size(); i++)
		{
			if (list.get(i)<min)
			{
				min = list.get(i);
				minIndex = i;
			}
		}
		return minIndex;
	}

}
