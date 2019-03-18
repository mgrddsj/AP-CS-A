import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Graded 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int r1 = rand.nextInt(11) + 15;
		int r2 = rand.nextInt(11) + 15;

		int[] array1 = new int[r1];
		ArrayList<Double> list1 = new ArrayList<>();

		fillRandomlyArray(array1);
		fillRandomlyArrayList(list1, r2);

		meanList(list1);
	}

	public static void fillRandomlyArray(int[] array)
	{
		Random rand = new Random();
		for (int i=0; i<array.length; i++)
		{
			array[i] = rand.nextInt(4001) + 1000;
		}
	}

	public static void fillRandomlyArrayList(ArrayList<Double> list, int r2)
	{
		Random rand = new Random();
		for (int i=0; i<r2; i++)
		{
			double temp = rand.nextDouble() + 2;
			while (temp > 2.5)
			{
				temp = rand.nextDouble() + 2;
			}
			list.add(temp);
		}
	}

	public static double meanList(List list)
	{
		double sum = 0;
		ArrayList<Double> arrayList = (ArrayList<Double>)list;
		for (double i:arrayList)
		{
			sum += i;
		}
		return sum/list.size();
	}

	public static int maxArray(int[] array)
	{
		int max = 0;
		for (int i:array)
		{
			if (i>max)
			{
				max = i;
			}
		}
		return max;
	}

	public static int medianArray(int[] array)
	{
		int median = 0;
		//Find the median
		return median;
	}

	public static ArrayList<Integer> scaleList(ArrayList<Double> list1)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for (double i:list1)
		{
			list.add((int) (i * 1000));
		}
		return list;
	}

	public static ArrayList<Double> scaleArray(int[] array1)
	{
		ArrayList<Double> list = new ArrayList<>();
		for (int i:array1)
		{
			list.add(i/1000.0);
		}
		return list;
	}

	public static double secondMaxArrayList(ArrayList<Double> list1)
	{
		ArrayList<Double> temp = (ArrayList<Double>) list1.clone();
		double secondMax = 0;

		for (int i=0; i<2; i++)
		{
			for (double r:temp)
			{
				if (r>secondMax)
				{
					secondMax = i;
				}
			}

			if (i == 0)
			{
				temp.remove(secondMax);
				secondMax = 0;
			}
		}

		return secondMax;
	}
	
}
