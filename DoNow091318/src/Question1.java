
public class Question1 
{
	public static void main(String[] args) 
	{
		printSomething("This is an example",5);
	}

	public static void printSomething(String s,int x)
	{
		//usage:print(the string you need to print, how many times it prints)
		for (int i = 0; i < x; i++) 
		{
			System.out.println(s);
		}
	}
}
