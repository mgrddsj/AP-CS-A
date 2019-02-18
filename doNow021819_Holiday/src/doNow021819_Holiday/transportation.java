package doNow021819_Holiday;

public class transportation {
	private int costPerUnitDist;
	private String vehicle;

	public transportation(inputCost, inputVehicle)
	{
		costPerUnitDist = inputCost;
		vehicle = inputVehicle;
	}

	pubic destroyVehicle(holiday h1)
	{
		h1.budgetMinus(costPerUnitDist * 100); //Compensation for destoying a vehicle. 
	}

	public takeARide(double distance, holiday h1)
	{
		h1.budgetMinus(costPerUnitDist * distance);
	}

	// public static void main(String[] args) 
	// {

	// }

}
