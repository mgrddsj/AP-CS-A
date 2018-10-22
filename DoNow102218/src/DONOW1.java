
public class DONOW1 
{

	public static void main(String[] args) 
	{
		squareBrackets(6);
	}

	public static void squareBrackets(int num)
	{
		int i=1;
		while (i<=num)
		{
			System.out.print("[" + i + "]");
			i++;
		}
	}
}
