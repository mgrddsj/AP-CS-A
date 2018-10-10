//Exercise 3 on pg.309
public class EXERCISES3 
{

	public static void main(String[] args) 
	{
		System.out.print(season(3,16));
	}

	public static String season(int month,int day)
	{
		if (month>12)
		{
			return "";
		}
		else
		{
			if (month%3 == 0)
			{
				if (day>=16)
					month++;
			}

			if (month>0 && month<=3 || month==13) 
				return "winter";
			else if (month>3 && month<=6) 
				return "spring";
			else if (month>6 && month<=9)
				return "summer";
			else
				return "fall";
		}
	}
}
