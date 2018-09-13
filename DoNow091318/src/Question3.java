

//A method that prints a string inversely
public class Question3 
{

	public static void main(String[] args) 
	{
		printInversely("Printed Inversely!!!");//usage example
	}

	public static void printInversely(String a)
	{
		for(int i=a.length();i>=1;i--)
		{
			System.out.print(a.substring(i-1, i));
		}
	}
}

