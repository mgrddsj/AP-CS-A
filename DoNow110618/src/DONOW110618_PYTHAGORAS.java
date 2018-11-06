public class DONOW110618_PYTHAGORAS 
{

	public static void main(String[] args) 
	{
		quadratic(4,1,4);
	}

	public static double pythagoras(double a,double b)
	{
		return Math.sqrt(Math.pow(a, 2)*Math.pow(b, 2));
	}
	
	public static String quadratic(double a,double b,double c)
	{
		if (a==0)
			return "Not a quadratic equation (a=0). ";
		else
		{
			String root;
			if ((Math.pow(b, 2)-(4.0*a*c))<0)
				root = "" + Math.sqrt(-(Math.pow(b, 2)-(4.0*a*c))) + "i";
			else 
				root = "" + (Math.pow(b, 2)-(4.0*a*c));
			System.out.println("x1 = (-" + b + " + " + root + ")/" + 2*a);
			System.out.println("x2 = (-" + b + " - " + root + ")/" + 2*a);
			return "x1 = (-" + b + " + " + root + ")/" + 2*a + "\n" + "x2 = (-" + b + " - " + root + ")/" + 2*a;
		}
	}
} 