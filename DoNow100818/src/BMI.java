import java.util.Scanner;

public class BMI 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input the information of the first person:");
		System.out.println("Please input your height (in centimeters): ");
		double height1 = in.nextDouble();
		System.out.println("Please input your weight (in kilograms) :");
		double weight1 = in.nextDouble();
		
		double bmi1=weight1/(height1 * height1);

		
		System.out.println("Input the information of the second person:");
		System.out.println("Please input your height (in centimeters): ");
		double height2 = in.nextDouble();
		System.out.println("Please input your weight (in kilograms) :");
		double weight2 = in.nextDouble();
		
		double bmi2=weight2/(height2 * height2);
		
		System.out.println("First person:");
		bmiDescription(bmi1);
		System.out.println("Second person:");
		bmiDescription(bmi2);
		
		in.close();
	}

    public static void bmiDescription(double bmi)
    {
     System.out.println("Your BMI: " + bmi);
     if(bmi<18.5) {
         System.out.println("Underweighted");
     } else if(bmi<24.9) {
         System.out.println("Normal");
     } else if(bmi<29.9) {
         System.out.println("Overweighted");
     } else {
         System.out.println("Obese");
    }
}
}
