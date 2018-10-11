
import java.util.Scanner;

public class DONOW101118_QUARDRANTS {

	public static void main(String[] args) {
		System.out.println(quadrant(1,1));
		System.out.println(quadrant(-1,1));
		System.out.println(quadrant(-1,-1));
		System.out.println(quadrant(1,-1));
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input x:");
		double x = in.nextDouble();
		System.out.print("Input y:");
		double y = in.nextDouble();
		System.out.println();
		in.close();
		System.out.println(quadrant(x,y));
	}

	public static int quadrant(double x,double y)
	{
		if(x>0)
		{
			if (y>0)
				return 1;
			else if (y<0)
				return 4;
			else 
				return 0;
		}
		else if (x<0)
		{
			if (y>0)
				return 2;
			else if (y<0)
				return 3;
			else 
				return 0;
		}
		else
			return 0;
	}
}
