
public class Question1 
{
	public static void main(String[] args) 
	{
		printSomething("This is an example");
	}

	public static void printSomething(String s)
	{
		
		int x = s.length();
		for (int i = 0; i < x; i++) 
		{
			System.out.println(s);
		}
	}
}
