
public class frq2019 
{

	public static void main(String[] args) 
	{
		
	}

	//Question 1
	public static int numberOfLeapYears(int year1, int year2)
	{
		int num = 0;
		while (year1<=year2)
		{
			if (isLeapYear(year1))
			{
				num++;
			}
			year1++;
		}
		return num;
	}

	public static int dayOfWeek(int month, int day, int year)
	{
		return (firstDayOfYear(year) + dayOfYear(month, day, year))%7;
	}

}

class StepTracker
{
	private int dailySteps;
	private int totalSteps;
	private int activeDays;
	private int totalDays;
	
	public StepTracker(int _dailySteps)
	{
		dailySteps = _dailySteps;
		totalSteps = 0;
		activeDays = 0;
		totalDays = 0;
	}

	public void addDailySteps(int steps)
	{
		totalSteps += steps;
		totalDays ++;
		if (steps > 10000)
		{
			activeDays++;
		}
	}

	public int activeDays()
	{
		return activeDays;
	}

	public double averageSteps()
	{
		if (totalDays == 0)
		{
			return 0;
		}
		return (double)dailySteps/totalDays;
	}

}

class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
		ArrayList<String> resultList = new ArrayList<String>();
		for (String str:tokens)
		{
			if (str.equals(openDel) || str.equals(closeDel))
			{
				resultList.add(str);	
			}
		}
		return resultList;
	}
	
	public boolean isBalanced(ArrayList<String> delimeters)
	{
		int opens=0;
		int closes=0;
		for (String str:delimeters)
		{
			if (str.equals(openDel))
			{
				opens++;
			}
			if (str.equals(closeDel))
			{
				closes++;
			}
		}
		if (opens!=closes)
		{
			return false;
		}
		for (int i=0;i<delimeters.size();i++)
		{
			if (delimeters.get(i).equals(closeDel) && !delimeters.get(i-1).equals(openDel))
			{
				return false;
			}
		}
		return true;
	}
}


