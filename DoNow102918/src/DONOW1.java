import java.util.Random;
import java.util.Scanner;

//PG386-Q7
public class DONOW1 
{
	public static int player1;
	public static int player2;
	
	public static void main(String[] args) 
	{
		player1=0;
		player2=0;
		
		while (player1<100&&player2<100)
		{
			pig(1);
			if (player1>=100)
				break;
			else
				pig(2);
		}
		
		if (player1>=100)
			System.out.println("Player 1 won. ");
		else
			System.out.println("Player 2 won. ");
	}

	public static void pig(int player)
	{
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		int score = 0;
		int dice = 0;
		System.out.println("\nPlayer " + player + ": ");
		while (dice!=1)
		{
			System.out.print("Roll a die? ");
			if (in.next().charAt(0)=='y')
			{
				dice = rand.nextInt(6)+1;
				System.out.println("You got " + dice);
				score+=dice;
			}
			else 
			{
				if (player==1)
				{
					player1+=score;
					System.out.println("You got " + score + " this round. You have " + player1 + " points. ");
				}
				if (player==2)
				{
					player2+=score;
					System.out.println("You got " + score + " this round. You have " + player2 + " points. ");
				}
				return;
			}
		}
		System.out.println("You lost all the point this round! ");
		return;
	}
}
