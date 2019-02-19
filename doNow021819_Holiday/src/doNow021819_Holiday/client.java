package doNow021819_Holiday;

import java.util.Random;

public class client {

	public static void main(String[] args)
	{
		Holiday newYear = new Holiday("New Year", 16);

		Random rand = new Random();
		while(rand.nextInt(10) != 1)
		{
			getRedPacket(rand.nextDouble(), rand.nextInt(1000), newYear);
		}
	}

	public static void getRedPacket(double distFromHome, double moneyGot, Holiday newYear)
	{
		newYear.transferByBicycle(distFromHome);
		newYear.budgetPlus(moneyGot);
	}
}
