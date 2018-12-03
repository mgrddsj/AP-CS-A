import java.util.Arrays;

//Self-check problems chapter 7
//Jesse Xu
public class Homework112818 
{

	public static void main(String[] args) 
	{
		problem4(-6,38);
	}

	public static void problem4(int min,int max)
	{
		int arrLength; 
		if (min%2==1 && max%2==1)
			arrLength = (max-min)/2-1;
		else
			arrLength = (max-min)/2;
		if (min%2==1)
			min++;
		int[] list = new int[arrLength];
		for (int i=0;i<arrLength;i++)
		{
			list[i] = min+i*2+1;
		}
		System.out.println(Arrays.toString(list));
	}
	
	public static void problem5()
	{
		//[0, 4, 11, 0, 44, 0, 0, 2]
	}
	
	public static void problem6()
	{
		//[3, 3, 0, 0, 6, 9, 0, -18]
	}
	
	public static int problem10_average(int[] list)
	{
		int max = Integer.MIN_VALUE;
		for (int i=0;i<list.length;i++)
			if (list[i]>max)
				max = list[i];
		return max;
	}
	
	public static void problem14()
	{
		//[3, 24, 8, -5, 6, 1]
	}
	
	public static void problem19()
	{
		/*
		 * 2 [0, 0, 1, 0]
		 * 1 [0, 0, 1, 0]
		 * 3 [0, 0, 1, 1]
		 * 2 [0, 0, 1, 1]
		 */
	}
	
	public static void problem20()
	{
		/*
		 * 2 [0, 1]
		 * 1 [0, 1]
		 * 1 [1, 2]
		 * 0 [1, 2]
		 */
	}
	
}
