import java.util.Scanner;

public class Test8 
{

	public static void main(String[] args) 
	{
		factorial();
	}

	public static void factorial()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a non-negative integer: ");
		int num=in.nextInt();
		in.close();
		if (num<0)
			return;
		
		int result=1;
		for (int i=1;i<=num;i++)
		{
			result*=i;
		}
		
		System.out.println("Result: " + result);
	}
}
