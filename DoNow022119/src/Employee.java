
public class Employee 
{
	public String name;
	public double salary;
	private int workHours;
	private int sickDays;

	public Employee()
	{
		
	}

	public Employee(String inputName, int inputSickDays)
	{
		name = inputName;
		salary = 40000.0;
		workHours = 40;
		sickDays = inputSickDays;
	}
	
	public int getHours() 
	{
		return 40; // works 40 hours / week
	}

	public double getSalary() 
	{
		return 40000.0;      // $40,000.00 / year
	}

	public int getVacationDays() 
	{
		return 10;           // 2 weeks' paid vacation
	}
	
	public String getVacationForm() 
	{
		return "yellow";     // use the yellow form
	}

	private void addSickDays()
	{
		sickDays++;
	}
	
}