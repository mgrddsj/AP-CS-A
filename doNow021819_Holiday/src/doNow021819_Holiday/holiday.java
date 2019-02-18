package doNow021819_Holiday;

public class holiday 
{
	private int lengthOfHoliday;
	private double redPacketReceived;
	private String holidayName;

	public holiday(String inputName)
	{
		holidayName = inputName;
	}

	public static void main(String[] args) 
	{
		
	}

	public transferByBicycle(double distance)
	{
		transportation eBike = new transportation(1, "ebike");
		eBike.takeARide(distance, this);
	}

	public budgetPlus(double value)
	{
		redPacketReceived += value;
	}

	public budgetMinus(double value)
	{
		redPacketReceived -= value;
	}
}
