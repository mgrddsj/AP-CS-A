
public class DONOW091218 
{

	public static void main(String[] args) 
	{
		slashes();
		for(int num=1;num>=-3;num--)
		{
			numbers(num);
		}
		slashes();
	}

	public static void slashes()
	{
		for(int slashes=1;slashes<=21;slashes++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	public static void blankLine()
	{
		System.out.print("|");
		for(int spaces = 1;spaces<=19;spaces++)
		{
			System.out.print(" ");
		}
		System.out.println("|");
	}
	public static void numbers(int portal)
	{
		for (int firstNums=portal;firstNums<=5;firstNums++)
		{
			System.out.print(firstNums);
		}
		for (int lastNums=portal+3;lastNums>=portal;lastNums--)
		{
			System.out.print(lastNums);
		}
		System.out.println();
		if (portal !=-3)
		{
			blankLine();
		}
	}
	
}
