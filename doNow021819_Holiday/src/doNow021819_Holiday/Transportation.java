package doNow021819_Holiday;

public class Transportation {
	private double costPerUnitDist;
	private String vehicle;

	public Transportation(double inputCost, String inputVehicle)
	{
		costPerUnitDist = inputCost;
		vehicle = inputVehicle;
	}

	public void destroyVehicle(Holiday h1)
	{
		h1.budgetMinus(costPerUnitDist * 100); //Compensation for destoying a vehicle. 
		System.out.println("You destroyed the " + vehicle + ", you paid a compensation of ¥" + (costPerUnitDist * 100) + ". ");
	}

	public void takeARide(double distance, Holiday h1)
	{
		h1.budgetMinus(costPerUnitDist * distance);
		System.out.print("Riding a " + vehicle + ", cost you " + (costPerUnitDist * distance) + ". ");
	}

	public String toString()
	{
		return vehicle + ": " + costPerUnitDist + " ¥/hr. ";
	}

	// public static void main(String[] args) 
	// {

	// }

}
