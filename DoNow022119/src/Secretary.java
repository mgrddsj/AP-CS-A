
public class Secretary extends Employee
{
	public String speed;
	private String typos;

	public Secretary()
	{
		speed = "fast";
		typos = "A lot";
	}
	
	public void takeDictation(String text)
	{
		System.out.println("Taking dictation of text: " + text);
	}

	public void organizeDictation()
	{
		System.out.println("Organizing... ");
	}

	private void makeFewerTypos()
	{
		System.out.println("It's not a big deal. ");
	}

	public double springBoard()
	{
		super.getSalary();// Use super to access behavior. 
		return super.salary;
	}

}
