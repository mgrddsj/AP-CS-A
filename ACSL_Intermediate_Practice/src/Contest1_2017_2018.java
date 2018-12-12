
public class Contest1_2017_2018 
{
	public static int score;
	public static void main(String[] args) 
	{
		
	}

	public static void ninetyNine(String input)
	{
		String[] list = input.split(", ");
		int[] newList = new int[10];
		int[] handCard = new int[3];

		score = Integer.parseInt(list[0]);
		normalizeArray(list, newList);
		for (int i=0;i<3;i++)
		{
			handCard[i] = newList[i];
		}

		boolean turn = true; //true=player, false=dealer
		for (int i=0;i<7;i++)
		{
			if (turn)
			{
				//player
				
			}
			else 
			{
				//dealer
			}
		}

	}

	public static void normalizeArray(String[] list,int[] newList)
	{
		for (int i=0;i<10;i++)
		{
			if (list[i+1]=="T")
				newList[i] = 10;
			else if (list[i+1]=="J")
				newList[i] = 11;
			else if (list[i+1]=="Q")
				newList[i] = 12;
			else if (list[i+1]=="K")
				newList[i] = 13;
			else if (list[i+1]=="A")
				newList[i] = 14;
			else 
				newList[i] = Integer.parseInt(list[i+1]);
		}
	}
}
