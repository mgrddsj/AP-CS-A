//Exercise 4 on pg.309


public class EXERCISES4 
{

	public static void main(String[] args) 
	{
		for (int i=0;i<=13;i++)
			System.out.println(daysInMonth(i));
	}

	public static int daysInMonth(int month)
	{
		if (month>12 || month<1)
			return 0;
		
		if (month==2)
			return 28;
		else
		{
			if (month<=7)
			{
				if (month%2 == 1)
					return 31;
				else
					return 30;
			}
			else
			{
				if (month%2 ==0)
					return 31;
				else
					return 30;
			}
		}
	}
}

