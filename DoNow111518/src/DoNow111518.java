
public class DoNow111518 
{

	public static void main(String[] args) 
	{
		System.out.println(evenCounter_For("DAB"));
		System.out.println(evenCounter_While("DAB"));
	}

	public static int evenCounter_For(String text)
	{
		int counter = 0;
		for (int i=0;i<=text.length()-1;i++)
			if (text.charAt(i)%2==0)
				counter++;
		return counter;
	}
	
	public static int evenCounter_While(String text)
	{
		int counter = 0;
		int i = 0;
		while (i<=text.length()-1)
		{
			if (text.charAt(i)%2==0)
				counter++;
			i++;
		}
		return counter;
	}
}
