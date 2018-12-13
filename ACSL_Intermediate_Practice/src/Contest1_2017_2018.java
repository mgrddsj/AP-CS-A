import java.util.Scanner;

public class Contest1_2017_2018 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(ninetyNine(input));
		in.close();
	}

	public static String ninetyNine(String input)
	{
		String[] list = input.split(", ");
		int[] normalizedList = new int[10];
		int[] handCard = new int[3];

		int score = Integer.parseInt(list[0]);
		normalizeArray(list, normalizedList);
		for (int i=0;i<3;i++)
		{
			handCard[i] = normalizedList[i];
		}

		boolean turn = true; //true=player, false=dealer
		String output = "";
		for (int i=0;i<7;i++)
		{
			if (turn)
			{
				//player
				int maxHandCardLocation = 0;
				for (int a=0;a<3;a++)
				{
					if (handCard[a]>maxHandCardLocation)
					{
						maxHandCardLocation = a;
					}
				}
				
				//Add score according to rules. 
				if (handCard[maxHandCardLocation] == 9)
					score += 0;
				else if (handCard[maxHandCardLocation] == 10)
					score -= 10;
				else if (handCard[maxHandCardLocation] == 14)
				{
					if (score+14 > 99)
						score ++;
					else
						score += 14;
				}
				else 
					score += handCard[maxHandCardLocation];

				handCard[maxHandCardLocation] = normalizedList[i+3];
				turn = false;
			}
			else 
			{
				//dealer
				
				//Add score according to rules. 
				if (normalizedList[i+4] == 9)
					score += 0;
				else if (normalizedList[i+4] == 10)
					score -= 10;
				else if (normalizedList[i+4] == 14)
				{
					if (score+14 > 99)
						score ++;
					else
						score += 14;
				}
				else 
					score += normalizedList[i+4];
				
				turn = true;
			}
			
			//Check who wins
			if (score >= 99)
			{
				output += score + ", ";
				if (!turn)
					output += "player";
				else 
					output += "dealer";
				break;
			}
		}
		return output;

	}

	public static void normalizeArray(String[] list,int[] normalizedList)
	{
		for (int i=0;i<10;i++)
		{
			if (list[i+1].charAt(0)=='T')
				normalizedList[i] = 10;
			else if (list[i+1].charAt(0)=='J')
				normalizedList[i] = 11;
			else if (list[i+1].charAt(0)=='Q')
				normalizedList[i] = 12;
			else if (list[i+1].charAt(0)=='K')
				normalizedList[i] = 13;
			else if (list[i+1].charAt(0)=='A')
				normalizedList[i] = 14;
			else 
				normalizedList[i] = Integer.parseInt(list[i+1]);
		}
	}
}
