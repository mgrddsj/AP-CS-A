import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DoNow 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();

		fillRandomlyArrayList(list1, 25);

		System.out.println(list1);
		System.out.println();

		insertionSort(list1);

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

	public static void insertionSort(ArrayList<Integer> list)
	{
		for (int sorted=1; sorted<list.size()-1; sorted++)
		{
			for (int i=0;i<=sorted;i++)
			{
				if (list.get(sorted + 1) <= list.get(i)) 
				{
					int temp = list.get(sorted + 1);
					list.remove(sorted + 1);
					list.add(i, temp);
				}
			}
		}
	}

}
