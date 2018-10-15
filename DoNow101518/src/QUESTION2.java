
public class QUESTION2 {

	public static void main(String[] args) {
		System.out.print(prime(30));
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
	
	public static long prime(int max)
	{
		long  multiplied = 1;
		for(int i=2;i<=max;i++)
		{
			if (countFactors(i)==2)
				multiplied *= i;
		}
		return multiplied;
	}
}
