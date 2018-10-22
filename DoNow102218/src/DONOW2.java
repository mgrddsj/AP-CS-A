
public class DONOW2 
{

	public static void main(String[] args) 
	{
		gauss(2,3);
	}

	public static void gauss(int x,int n)
	{		
		int sum=0;
		for (int i=0;i<n;i++)
		{

			int pow1 = power(-1,i);

			int pow2 = power(x,(2 * i));
			
			double result =factorial(i);
			
			sum += ((double)pow1*((double)pow2/result));
		}
		System.out.println(sum);
	}
	
	public static int factorial(int num)
	{
		int result=1;
		for (int i=1;i<=num;i++)
		{
			result*=i;
		}
		return result;
	}
	
	public static int power(int base,int pow)
	{
		int result = 1;
		for (int i = 1;i<=pow;i++)
		{
			result *= base;
		}
		return result;
	}
}
