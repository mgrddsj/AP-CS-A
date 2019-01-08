import java.util.Random;
import java.util.Scanner;

public class Game 
{
	public static boolean wins = false;
	
	
	public static void main(String[] args) 
	{
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("What game mode would you like? (1 for PVP, 2 for battle against computer). ");
		int gm = in.nextInt();

		if (gm == 2)
		{
			//pVc();
		}
		else 
		{
			pVp();
		}
		in.close();
		*/
		pVp();//PVC not updated yet. 
	}

	public static void pVp()
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int[][] board = new int[9][9]; //[column][row]
		int player = 1;
		printTheBoard(board);//First Run print out. 
		
		while (!wins)
		{
			System.out.println("Player " + player + "'s turn: ");
			// Bomb 
			boolean bomb = false;
			if (rand.nextInt(15) == 2)
			{
				System.out.println("Lucky you! You've got a bomb. It will destroy 3x3 area around it! ");
				bomb = true;
			}
			
			System.out.print("Which column? ");
			int columnIn = in.nextInt()+4;
			System.out.print("Which Row? ");
			int rowIn = in.nextInt()+4;
			boolean occupied = true;

			while (occupied)
			{
				if (board[columnIn][rowIn] == 0)
				{
					occupied = false;
					//board[columnIn][rowIn] = player;
					
					//Bomb code. 
					if (bomb)
					{
						for (int c=-1;c<=1;c++)
						{
							for (int r=-1;r<=1;r++)
							{
								try
								{
									board[columnIn+c][rowIn+r] = 0;
								}
								catch (IndexOutOfBoundsException exception)
								{

								}
							}
						}
					}
					else
					{
						board[columnIn][rowIn] = player;
					}
					
				}
				else 
				{
					System.out.println("This place has been occupied! Choose anotehr one! ");
					System.out.print("Which column? ");
					columnIn = in.nextInt()+4;
					System.out.print("Which Row? ");
					rowIn = in.nextInt()+4;
				}
			}
			
			/* Old Code, not useful 
			for (int row=5;row>=0;row--)
			{
				if (board[columnIn-1][row] ==0)
				{
					if (bomb)
					{
						if (row+1<6)
							board[columnIn-1][row+1] = 0;
						if (columnIn-2>0)
						{
							if (row-1>=0)
								board[columnIn-2][row-1] = 0;
							board[columnIn-2][row] = 0;
							if (row+1<6)
								board[columnIn-2][row+1] = 0;
						}
						if (columnIn<7)
						{
							if (row-1>=0)
								board[columnIn][row-1] = 0;
							board[columnIn][row] = 0;
							if (row+1<6)
								board[columnIn][row+1] = 0;
						}
					}
					else
					{
						board[columnIn-1][row] = player;
					}
					break;
				}
			}
			*/
			
			if (rand.nextInt(10) == 5)
			{
				System.out.println("You've got \"I AM YOUR FATHER\", skip next round! ");
			}
			else
			{
			if (player == 1)
				player = 2;
			else 
				player = 1;
			}
			
			printTheBoard(board);
			check(board);
		}
		in.close();
	}
	
	/*
	public static void pVc()
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int[][] board = new int[9][9]; //[column][row]
		int player = 1;
		System.out.println("Silly computer joined the game! ");
		
		while (!wins)
		{
			int columnIn;
			boolean bomb =false;
			
			if (player == 1)
			{
				System.out.println("Your turn: ");
				if (rand.nextInt(5) == 2)
				{
					System.out.println("Lucky you! You've got a bomb. It will destroy 3x3 area around it! ");
					bomb = true;
				}
				columnIn = in.nextInt();
			}
			else 
			{
				columnIn = rand.nextInt(6)+1;
				System.out.println("Computer's turn! It plays " + columnIn);
			}
			
			for (int row=5;row>=0;row--)
			{
				if (board[columnIn-1][row] ==0)
				{
					if (bomb)
					{
						if (row+1<6)
							board[columnIn-1][row+1] = 0;
						if (columnIn-2>0)
						{
							if (row-1>=0)
								board[columnIn-2][row-1] = 0;
							board[columnIn-2][row] = 0;
							if (row+1<6)
								board[columnIn-2][row+1] = 0;
						}
						if (columnIn<7)
						{
							if (row-1>=0)
								board[columnIn][row-1] = 0;
							board[columnIn][row] = 0;
							if (row+1<6)
								board[columnIn][row+1] = 0;
						}
					}
					else
					{
						board[columnIn-1][row] = player;
					}
					break;
				}
			}
			
			if (rand.nextInt(10) == 5)
			{
				if (player == 1)
				{
					System.out.print("You've");
				}
				else
				{
					System.out.print("The computer has");
				}
				System.out.println(" got \"I AM YOUR FATHER\", skip next round! ");
			}
			else
			{
			if (player == 1)
				player = 2;
			else 
				player = 1;
			}
			
			printTheBoard(board);
			check(board);
		}
		in.close();
	}
	*/

    public static void printTheBoard(int[][] board)
    {
		System.out.println("The board now looks like: ");
    	for (int row=0;row<9;row++)
		{
			for (int column=0;column<9;column++)
			{
				if (column == 0)
				{
					if (row-4<0)
						System.out.print(row-4 + " |");
					else
						System.out.print(" " + (row-4) + " |");
				}
				if (board[column][row] == 1)
				{
					System.out.print("🔶");
				}
				else if (board[column][row] == 2)
				{
					System.out.print("🔴");
				}
				else 
				{
					System.out.print("  ");
				}
				if (column != 8)
					System.out.print("| ");
			}
			System.out.println();
			if (row != 8)
				System.out.println("----------------------------------------");
		}
    	System.out.println("    -4| -3| -2| -1| 0 | 1 | 2 | 3 | 4 ");
    }
    
    public static void check(int[][] board)
    {
    	wins = false;
    	int who = 0;
    	
    	//Check horizontally
    	for (int row=0;row<9;row++)
    	{
    		int continuous = 0;
    		for (int column=1;column<9;column++)
    		{
    			if (board[column][row] == board[column-1][row] && board[column][row]!=0)
    			{
    				continuous++;
    				if (continuous == 3)
    				{
    					//someone wins
    					wins = true;
    					who = board[column][row];
    				}
    			}
    			else 
    			{
    				continuous = 0;
    			}
    		}
    	}
    	
    	//Check vertically
    	for (int column=0;column<9;column++)
    	{
    		int continuous = 0;
    		for (int row=1;row<9;row++)
    		{
    			if (board[column][row] == board[column][row-1] && board[column][row]!=0)
    			{
    				continuous++;
    				if (continuous == 3)
    				{
    					//someone wins
    					wins = true;
    					who = board[column][row];
    				}
    			}
    			else 
    			{
    				continuous = 0;
    			}
    		}
    	}
    	
    	//Check top left to bottom right
    	
    	for (int row=0;row<=5;row++)
    	{
    		for (int column=0;column<=5;column++)
    		{
    			int temp = board[column][row];
    			if (temp==0)
    				continue;
    			int time = 0;
    			for (int i=0;i<=3;i++)
    			{
    				if (board[i+column][i+row] != temp)
    				{
    					break;
    				}
    				else 
    				{
    					//Equals. 
    					time++;
    					if (time==4)
    					{
    						wins = true;
    						who = temp;
        					break;
    					}
    				}
    			}
    		}
    	}
    	
    	//Check top right to bottom left
    	
    	for (int row=0;row<=5;row++)
    	{
    		for (int column=3;column<=8;column++)
    		{
    			int temp = board[column][row];
    			if (temp==0)
    				continue;
    			int time = 0;
    			for (int i=0;i>=-4;i--)
    			{
    				if (board[column+i][row-i] != temp)
    				{
    					break;
    				}
    				else 
    				{
    					//Equals. 
    					time++;
    					if (time==4)
    					{
    						wins = true;
    						who = temp;
    						break;
    					}
    				}
    			}
    		}
    	}
    	
    	if (wins)
    	{
    		if (who == 1)
    			System.out.println("Yellow wins! ");
    		else 
    			System.out.println("Red wins! ");
    	}
    }
}
