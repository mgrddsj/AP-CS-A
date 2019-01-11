
public class DoNow011119 
{

	public static void main(String[] args) 
	{
		int[][] array = new int[10][5];
		for (int column=0;column<array.length;column++)
		{
			int prefix = 0;	
			for (int one=column/2;one>=0;one-=2)
			{
				prefix += Math.pow(10, one)*one;
			}

			if (column%2==0)
			{
				for (int row=4;row>=0;row--)
				{
					array[column][row-0] = prefix + (5-row);
				}
			}
			else
			{
				for (int row=0;row<=5;row++)
				{
					array[column][row-1] = prefix + row;
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
