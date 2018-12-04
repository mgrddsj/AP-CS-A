import java.util.Arrays;

public class twoDArray 
{

	public static void main(String[] args) 
	{
		
	}

	public static int max(int[][] list)
	{
		int max = Integer.MIN_VALUE;
		for (int i=0;i<list.length;i++)
			for (int j=0;i<list[0].length;i++)
				if (list[i][j] > max)
					max = list[i][j];
		return max;
	}
	
	public static void sumOfColumn(double[][] list)
	{
		int sum = 0;
		for (int i=0;i<list.length;i++)
		{
			for (int j=0;i<list[0].length;i++)
					sum += list[i][j];
			System.out.println(sum);
			sum = 0;
		}
	}
	
	public static void printRowOrder(int[][] list)
	{
		for (int i=0;i<list.length;i++)
		{
			System.out.println(Arrays.toString(list[i]));
		}
	}
}
