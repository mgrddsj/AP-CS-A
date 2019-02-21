
public class Lawyer extends Employee
{
	
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
	
}
