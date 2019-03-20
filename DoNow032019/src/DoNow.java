import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DoNow 
{

	public static void main(String[] args) 
	{
		int[] array1 = new int[25];
		ArrayList<Integer> list1 = new ArrayList<>();

		fillRandomlyArray(array1);
		fillRandomlyArrayList(list1, 25);

		System.out.println(Arrays.toString(array1));
		System.out.println(list1);
		System.out.println();

		selectionSortArray(array1);
		selectionSortArrayList(list1);

		System.out.println(Arrays.toString(array1));
		System.out.println(list1);
		System.out.println();

		selectSortEvenThanOdd(array1);
		selectSortEvenThanOdd(list1);

		System.out.println(Arrays.toString(array1));
		System.out.println(list1);
		System.out.println();
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

	public static void selectSortEvenThanOdd(int[] array)
	{
		int lastEvenIndex = 0;
		for (int i=0; i<array.length; i++)
		{
			if (array[i]%2 == 0)
			{
				int temp = array[i];
				for (int r=i; r>lastEvenIndex; r--)
				{
					array[r] = array[r-1];
				}
				array[lastEvenIndex] = temp;
				lastEvenIndex++;
			}
		}
	}

	public static void selectSortEvenThanOdd(ArrayList<Integer> list)
	{
		int lastEvenIndex = 0;
		for (int i=0; i<list.size(); i++)
		{
			if (list.get(i)%2 == 0)
			{
				int temp = list.get(i);
				list.remove(i);
				list.add(lastEvenIndex, temp);
				lastEvenIndex++;
			}
		}
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

	public static void insertionSort(int[] array)
	{
		for (int sorted=1; sorted<array.length; sorted++)
		{
			for (int i=0; i<=sorted; i++)
			{
				//	Not finished
			}
		}
	}

}
