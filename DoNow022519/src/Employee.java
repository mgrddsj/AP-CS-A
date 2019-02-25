
public class Employee 
{
	public String name;
	public double salary = 40000.0;
	public int vacationDays = 10;
	private int workHours = 40;
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
		return workHours; // works 40 hours / week
	}

	public double getSalary() 
	{
		return salary;      // $40,000.00 / year
	}

	public int getVacationDays() 
	{
		return vacationDays;           // 2 weeks' paid vacation
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