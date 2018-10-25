
public class Test6 
{

	public static void main(String[] args) 
	{
		powers(5);
	}

	public static void powers(int num)
	{
		System.out.println("Here are the first " + num + " powers of 2: ");
		for (int i=0;i<num;i++)
		{
			System.out.print("2^" + i +" = ");
			if (i==0)
			{
				System.out.println(1);
			}
			else 
			{
				int result=1;
				for (int count=1;count<=i;count++)
				{
					result*=2;
				}
				System.out.println(result);
			}
		}
	}
}
