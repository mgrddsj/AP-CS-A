
public class DoNow011119 
{

	public static void main(String[] args) 
	{
		int[][] array = new int[6][5];
		for (int column=0;column<array.length;column++)
		{
			String ones = "0";
			for (int one=0;one<column/2;one++)
			{
				ones += "1";
			}
			
			if (column%2==0)
			{
				for (int row=5;row>=1;row--)
				{
					array[column][row-1] = Integer.parseInt((ones + (6-row)));
				}
			}
			else
			{
				for (int row=1;row<=5;row++)
				{
					array[column][row-1] = Integer.parseInt((ones + row));
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
