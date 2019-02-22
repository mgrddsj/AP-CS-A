
public class Lawyer extends Employee
{
	public boolean isEvil;
	private boolean isEvilInReality;

	public Lawyer()
	{
		super(); // Try using super(). 
		isEvil = false;
		isEvilInReality = true;
	}

	public String getVacationForm()
	{
		return "pink";
	}

	public int getVacationDays()
	{
		return 15;	//3 weeks' paid vacation. 
	}

	public void sue(String someone)
	{
		System.out.println("You sued " + someone);
	}

	private void becomeNotEvil()
	{
		System.out.println("I'll consider about it. ");
	}

	private void addSickDays()
	{
		System.out.println("Acess denied. ");
	}

	//Trying to access private field of Employee
	private void accessPrivateField()
	{
		// System.out.println(super.workHours);		The field Employee.workHours is not visible
	}


	
}
