import java.util.Scanner;

public class Contest1_2016_2017 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(agram(input));
	}

	public static String agram(String input)
	{
		String[] list = input.split(", ");

		boolean hasSameSuit = false;
		char suit = 'a';
		char card = '0';
		for (int i=1;i<6;i++)
		{
			
			if (list[i].charAt(1) == list[0].charAt(1))
			{
				hasSameSuit = true;
				suit = list[i].charAt(1);

				if (card == '0')
				{
					if (compareGetLarge(list[i].charAt(0), list[0].charAt(0), true) == list[i].charAt(0))
					{
						card = list[i].charAt(0);
					}
				}
				else 
				{
					if (compareGetLarge(card, list[i].charAt(0), false) == card)
					{
						card = list[i].charAt(0);
					}
				}
			}
		}
		
		if (hasSameSuit && card=='0')
		{
			char max = list[0].charAt(0);
			for (int i=1;i<6;i++)
			{
				if (list[i].charAt(0)=='A' && list[i].charAt(1) == list[0].charAt(1))
				{
					card = 'A';
					break;
				}
				else if (compareGetLarge(list[i].charAt(0), max, false)==list[i].charAt(0) && list[i].charAt(1) == list[0].charAt(1))
				{
					card = list[i].charAt(0);
					max = list[i].charAt(0);
				}
			}
		}

		if (!hasSameSuit)
		{
			for (int i=1;i<6;i++)
			{
				if (list[i].charAt(0)=='A')
					{
						card = 'A';
						suit = list[i].charAt(1);
						break;
					}
			}
			
			boolean isNumber = false;
			for (int c=9;c>=2;c--)
			{
				for (int i=1;i<6;i++)
				{
					if (list[i].charAt(0)==("" + c).charAt(0))
					{
						card = list[i].charAt(0);
						suit = list[i].charAt(1);
						isNumber = true;
					}
				}
			}
			
			if (!isNumber)
			{
				for (int i=1;i<6;i++)
				{
					if (list[i].charAt(0)=='T')
					{
						card = list[i].charAt(0);
						suit = list[i].charAt(1);
						isNumber = true;
						break;
					}
				}
			}
			if (!isNumber)
			{
				for (int i=1;i<6;i++)
				{
					if (list[i].charAt(0)=='J')
					{
						card = list[i].charAt(0);
						suit = list[i].charAt(1);
						isNumber = true;
						break;
					}
				}
			}
			if (!isNumber)
			{
				for (int i=1;i<6;i++)
				{
					if (list[i].charAt(0)=='Q')
					{
						card = list[i].charAt(0);
						suit = list[i].charAt(1);
						isNumber = true;
						break;
					}
				}
			}
			if (!isNumber)
			{
				for (int i=1;i<6;i++)
				{
					if (list[i].charAt(0)=='K')
					{
						card = list[i].charAt(0);
						suit = list[i].charAt(1);
						isNumber = true;
						break;
					}
				}
			}
		}
		
		return "" + card + suit;
	}

	public static char compareGetLarge(char first,char second,boolean mode)
	{
		int firstToInt;
		int secondToInt;

		if (first == 'A')
			firstToInt = 1;
		else if (first == 'T')
			firstToInt = 10;
		else if (first == 'J')
			firstToInt = 11;
		else if (first == 'Q')
			firstToInt = 12;
		else if (first == 'K')
			firstToInt = 13;
		else 
			firstToInt = first;

		if (second == 'A')
			secondToInt = 1;
		else if (second == 'T')
			secondToInt = 10;
		else if (second == 'J')
			secondToInt = 11;
		else if (second == 'Q')
			secondToInt = 12;
		else if (second == 'K')
			secondToInt = 13;
		else 
			secondToInt = second;

		if (mode)
		{
			if (firstToInt > secondToInt)
				return first;
			else 
				return second;
		}
		else 
		{
			if (firstToInt > secondToInt)
				return second;
			else 
				return first;
		}
	}
}
