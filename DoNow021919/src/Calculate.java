
public class Calculate
{

	public static void main(String[] args)
	{
		calculate(11111, 22222);
	}
	
	public static int calculate(int n1, int n2)
	{
		return n1+n2;
	}

	public static double calculate(double n1, double n2)
	{
		return n1-n2;
	}

	public static double calculate(double n1, int n2)
	{
		return n1*n2;
	}

	public static String calculate(double n1, double n2, double n3)
	{
		return (n1/n2/n3) + "";
	}
}
