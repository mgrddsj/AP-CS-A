
public class Lawyer extends Employee
{
	public boolean isEvil;
	private boolean isEvilInReality;

	public Employee()
	{
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
	
}
