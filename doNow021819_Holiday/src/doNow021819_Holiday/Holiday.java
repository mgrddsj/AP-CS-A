package doNow021819_Holiday;

public class Holiday 
{
	private int lengthOfHoliday;
	private double redPacketReceived;
	private String holidayName;
	private Transportation eBike = new Transportation(10, "eBike");

	public Holiday(String inputName, int inputLength)
	{
		holidayName = inputName;
		lengthOfHoliday = inputLength;
		redPacketReceived = 0;
	}

	// public static void main(String[] args) 
	// {
		
	// }

	public void transferByBicycle(double distance)
	{
		System.out.println("You unlocked an eBike. ");
		eBike.takeARide(distance, this);
	}

	public void budgetPlus(double value)
	{
		redPacketReceived += value;
		System.out.println("You received ¥" + value + ". Now you have ¥" + redPacketReceived + ". ");
	}

	public void budgetMinus(double value)
	{
		redPacketReceived -= value;
		System.out.println("Your budget is reduced by ¥" + value + ". Now you have ¥" + redPacketReceived + ". ");
	}

	public String toString()
	{
		return "This is " + holidayName + " holiday, it is " + lengthOfHoliday + " days long. ";
	}
}
