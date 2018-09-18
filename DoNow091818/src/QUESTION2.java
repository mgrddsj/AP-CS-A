//Prints a string in a shape of pyramid. 
public class QUESTION2 
{

	public static void main(String[] args) 
	{
		pyramid("Sample usage");//Sample usage
	}

	public static void pyramid(String text)
	{
		for(int i = text.length();i>=1;i--)
		{
			System.out.println(text.substring(0, i));
		}
	}
}
