import java.util.Scanner;

public class Test10 {

	public static void main(String[] argv)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("give x and n");
	int x = s.nextInt();
	int n = s.nextInt();
	System.out.println("solution is :"+Math.pow(Math.E, -(x*x)));
	System.out.println("Method solution : "+gauss(x,n));
	s.close();
	}

	public static double gauss(int x, int n) 
	{ 
		double sum = 0.0; 
		for(int i=0; i<=n; i++) 
		{ 
			sum+=sign(i)*expo(x,i*2)/fact(i); 
		}
		return sum; 
	} 
	public static double expo(int x, int i) 
	{ 
		double product=1.; 
		for(int k=1; k<=i;k++) 
		{ 
			product*=x; 
		} 
		return product; 
	} 
	public static double fact(int i) 
	{
		double product=1.;
		for(int k=2; k<=i;k++) 
		{
			product*=k;
		} 
		return product; 
	} 
	public static double sign(int i) 
	{ 
		double product=1.;
		for(int k=1; k<=i;k++) 
		{ 
			product*=-1; 
		} 
		return product; 
	}

}
