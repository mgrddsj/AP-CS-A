import java.util.Scanner;

public class BMI 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input your height (in centimeters): ");
		double height1 = in.nextDouble();
		System.out.println("Please input your weight (in kilograms) :");
		double weight1 = in.nextDouble();
		
		double bmi1=weight1/(height1 * height1);
		
		System.out.println("Please input your height (in centimeters): ");
		double height2 = in.nextDouble();
		System.out.println("Please input your weight (in kilograms) :");
		double weight2 = in.nextDouble();
		
		
		in.close();
	}

}
