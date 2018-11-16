
public class DoNow111618 
{

	public static void main(String[] args) 
	{
		floydTriangle(5);
		pascalTriangle(10);
	}

	public static void floydTriangle(int lines)
	{
		int num=1;
		for(int i=1;i<=lines;i++)
		{
			for (int row=1;row<=i;row++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
	
	public static void pascalTriangle(int lines)
	{
		for(int i=0;i<=lines;i++)
		{
			for (int row=0;row<=i;row++)
			{
				System.out.print(((fac(i))/(fac(row)*fac(i-row))) + " ");
			}
			System.out.println();
		}
	}
	
	public static int fac(int n)
	{
		if (n == 0)    
		    return 1;    
		  else    
		    return(n * fac(n-1)); 
	}
}
