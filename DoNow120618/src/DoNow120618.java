import java.util.Arrays;

public class DoNow120618 
{

	public static void main(String[] args) 
	{
		int[][] matrix = {
			{2,7,6},
			{9,5,1},
			{4,3,8}
		};
		System.out.println(isMagicSquare(matrix));
	}

	public static void pg521Q34(int[][] matrix)
	{
		for (int i=0;i<matrix[1].length;i++)
		{
			matrix[4][i] = matrix[1][i];
		}
	}

	public static void pg521Q35()
	{
		/*
		4, 5, 6, 6
		5, 6, 7, 7
		6, 7, 8, 8
		*/
	}

	public static boolean isMagicSquare(int[][] matrix)
	{
		int sum = Arrays.stream(matrix[0]).sum();

		//Check if it is a square. 
		if (matrix.length != matrix[0].length)
			return false;

		//Check sum of rows. 
		for(int i=1;i<matrix.length;i++)
		{
			if (Arrays.stream(matrix[i]).sum() != sum)
				return false;
		}

		//Check sum of columns. 
		for (int c=0;c<matrix[0].length;c++)
		{
			int sumOfColumn = 0;
			for (int r=0;r<matrix.length;r++)
			{
				sumOfColumn += matrix[r][c];
			}
			if (sumOfColumn != sum)
				return false;
		}

		//Check sum of diagonals. 
		int sumOfDia = 0;
		for (int i=0;i<matrix.length;i++)
		{
			sumOfDia += matrix[i][i];
		}
		if (sumOfDia != sum)
			return false;
		
		int sumOfDia2 = 0;
		for (int r=matrix.length-1;r>=0;r--)
		{
			sumOfDia2 += matrix[r][matrix.length-1-r];
		}
		if (sumOfDia2 != sum)
			return false;

		//If not returned false, return true. 
		return true;
	}
}
