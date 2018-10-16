//Day of week from date


public class PROGRAMMINGPROJECT2_PG313 {

	public static void main(String[] args) {
		dayOfWeek(10,10,2482);
	}

	public static int dayOfWeek(int month,int day,int year)
	{
		int lastDigitsOfYear = Integer.parseInt(("" + year).substring(2, 4));
		//System.out.println(lastDigitsOfYear);
		int num = lastDigitsOfYear/4;
		num += day;
		num += keyValue(month);
		
		
		
		
		
		return 0;
	}
	
	public static int keyValue(int m)
	{
		if (m==1||m==10)
			return 1;
		else if (m==2||m==3||m==4)
			return 4;
		else if (m==4||m==7)
			return 0;
		else if (m==5)
			return 2;
		else if (m==6)
			return 5;
		else if (m==8)
			return 3;
		else if (m==9||m==12)
			return 6;
		else
			return 0;
	}
}
