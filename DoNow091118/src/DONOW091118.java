
public class DONOW091118 
{

	public static void main(String[] args) 
	{
		for(int i=6;i<=10;i++)
		{
			numbers(i);
			dollarMarks();
		}
	}

	public static void numbers(int num)
	{
		System.out.print("12345");
		for(int a = 6;a<=num;a++)
		{
			System.out.print(a);
		}
		for(int b=11-num;b>=1;b--)
		{
			System.out.print(b);
		}
		System.out.println();
	}
	
	public static void dollarMarks()
	{
		System.out.println("$$$$$$$$$$$");
	}
}
