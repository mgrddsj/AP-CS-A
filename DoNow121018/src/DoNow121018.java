import java.util.Arrays;
import java.util.Scanner;

public class DoNow121018 
{

	public static void main(String[] args) 
	{
		ticTacToe();
	}

	public static void ticTacToe()
	{
		Scanner in = new Scanner(System.in);

		char[][] ticTacToe = new char[3][3];
		boolean notFinished = true;
		int person = 1;
		while (notFinished)
		{
			System.out.println("It's person " + person + "'s turn: ");
			int column = in.nextInt();
			int row = in.nextInt();
			if (person == 1)
			{
				ticTacToe[column][row] = 'X';
				person = 2;
			}
			else 
			{
				ticTacToe[column][row] = 'O';
				person = 1;
			}
			System.out.println("Chess board now: ");
			for (int i=0;i<ticTacToe.length;i++)
			{
				System.out.println(Arrays.toString(ticTacToe[i]));
			}
		}
	}
}
