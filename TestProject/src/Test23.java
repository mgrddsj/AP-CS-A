
public class Test23 
{

	public static void main(String[] args) 
	{
		AA obj = new BB();
		obj.both();
		((BB) obj).onlyB();
		obj.onlyA();

		
	}

}

class AA
{
	public void both()
	{
		System.out.println("AAA");
	}
	public void onlyA()
	{
		System.out.println("Only A");
	}
}

class BB extends AA
{
	public void both()
	{
		System.out.println("BBB");
	}
	
	public void onlyA()
	{
		System.out.println("Changed");
	}
	
	public void onlyB()
	{
		System.out.println("Only B");
	}
}

