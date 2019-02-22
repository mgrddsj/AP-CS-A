
public class Secretary extends Employee
{
	public String speed;
	private String typos;

	public Employee()
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

}
