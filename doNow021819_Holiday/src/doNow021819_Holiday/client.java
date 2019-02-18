package doNow021819_Holiday;

import java.util.Random;

public class client {
	private int hapiness = 0;

	public static void main(String[] args)
	{

	}

	public static void getRedPacket(String where, double moneyGot)
	{

	}

	private void happinessIncrease(double moneyGot)
	{
		Random rand = new Random();
		hapiness += rand.nextInt((int)moneyGot*10);
	}
}
