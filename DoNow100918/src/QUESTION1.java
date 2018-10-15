//Prime numbers 
public class QUESTION1 
{

	public static void main(String[] args) 
	{
		prime(100);
	}

	public static int countFactors(int num)
	{
		int numOfFactors=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				numOfFactors++;
		}
		return numOfFactors;
	}
	
	public static void prime(int max)
	{
		for(int i=2;i<=max;i++)
		{
			if (countFactors(i)==2)
				System.out.print(i + " ");
		}
	}
}
