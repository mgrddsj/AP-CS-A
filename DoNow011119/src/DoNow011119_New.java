
public class DoNow011119_New 
{

	public static void main(String[] args) 
	{
		int[][] array = new int[10][5];
		for (int column=0;column<array.length;column++)
		{
			int ones = 0;	
			for (int one=0;one<=column/2;one++)
			{
				ones += Math.pow(10, one);
			}

			if (column%2==0)
			{
				for (int row=5;row>=1;row--)
				{
					array[column][row-1] = ones + (5-row);
				}
			}
			else
			{
				for (int row=1;row<=5;row++)
				{
					array[column][row-1] = ones + row-1;
				}
			}
		}

		//Print 2D array. 
		for (int column=0;column<array.length;column++)
		{
			for (int row=0;row<array[0].length;row++)
			{
				System.out.print(array[column][row] + ",");
			}
			System.out.println();
		}
	}

}
