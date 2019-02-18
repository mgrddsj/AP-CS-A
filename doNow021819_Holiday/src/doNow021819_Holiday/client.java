package doNow021819_Holiday;

import java.util.Random;

public class client {
	private int hapiness = 0;

	public static void main(String[] args)
	{
		holiday newYear = new holiday("New Year");

		Random rand = new Random();
		while(rand.nextInt(10) != 1)
		{
			getRedPacket(rand.nextDouble, rand.nextInt(1000));
		}
	}

	public static void getRedPacket(double distFromHome, double moneyGot)
	{
		holiday.transferByBicycle(distFromHome);
		holiday.budgetPlus(moneyGot);
		happinessIncrease(moneyGot);
	}

	private void happinessIncrease(double moneyGot)
	{
		Random rand = new Random();
		hapiness += rand.nextInt((int)moneyGot*10);
	}
}
