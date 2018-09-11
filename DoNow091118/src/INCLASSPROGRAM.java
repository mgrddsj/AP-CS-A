
public class INCLASSPROGRAM 
{

	public static void main(String[] args) 
	{
		for(int i=4;i>=1;i--)
		{
			numbers(i);
			stars(i-1);
		}
	}

	public static void numbers(int a)
	{
		for(int b=a;b<=10;b++)
		{
			System.out.print(b + ",");
		}
		for(int c=11;c<=15-a;c++)
		{
			System.out.print(c + ",");
		}
		System.out.println();
	}
	
	public static void stars(int num)
	{
		for (int i=num+1;i>=0;i--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
