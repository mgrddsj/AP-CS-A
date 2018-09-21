
public class OVERLOADING 
{

	public static void main(String[] args) 
	{
		System.out.println(tryMe(1));
		System.out.println(tryMe(1.0));
		System.out.println(tryMe(1.0,2));
		System.out.println(tryMe(1,2));
		//System.out.println(tryMe(1.0,2.0)); //error
	}

	public static double tryMe(int x)
	{
		return x+5;
	}
	
	public static double tryMe(double x)
	{
		return x*.375;
	}
	
	public static double tryMe(double x,int y)
	{
		return x+y;
	}
}
