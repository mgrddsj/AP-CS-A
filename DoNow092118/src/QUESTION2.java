
public class QUESTION2 
{

	public static void main(String[] args) 
	{
		System.out.println(calculatingMachine(2,3));
	}

	public static double calculatingMachine(int x,int y)
	{
		return x*x*Math.pow(y, -x);
	}
}
