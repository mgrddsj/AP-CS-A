import java.util.Scanner;

public class DONOW 
{

	public static void main(String[] args) 
	{
		
	}

	public static double degreesToRadians(double degrees)
	{
		return degrees/180.0*Math.PI;
	}
	
	public static double radiansToDegrees(double radians)
	{
		return radians/Math.PI*180;
	}
	
	public static void triangleArea()
	{
		Scanner in = new Scanner(System.in); 
		System.out.println("What type of triangle? (Right/Scalene/Euilateral/Obtuse/Isoceles");
		boolean validInput = false;
		while (!validInput)
		{
			switch (in.nextLine())
			{
			case "rig¡ht": case "Right":
				right();
				validInput = true;
				break;
			default: 
				validInput = false;
			}
		}
	}
	
	public static void right()
	{
		Scanner in = new Scanner(System.in); 
		System.out.print("height? ");
		double h = in.nextDouble();
		System.out.print("base? ");
		double b = in.nextDouble();
		System.out.println("Area: " + ((b*h)/2.0));
	}
	
	public static void scalene()
	{
		Scanner in = new Scanner(System.in); 
		System.out.print("Side 1? ");
		double a = in.nextDouble();
		System.out.print("Side 2? ");
		double b = in.nextDouble();
		System.out.print("Side 3? ");
		double c = in.nextDouble();
	}
}
