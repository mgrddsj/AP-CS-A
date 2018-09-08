//Name: Jesse Xu
//Last changed: 25.08.2018
//Description: Converts speed from mi/s to km/h

import java.util.Scanner;
public class speedConverter 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); //Creates a scanner object. 
		System.out.println("Please enter the speed you want to convert (in mi/s): "); //Notify the user to input the speed to be converted. 
		double speed = in.nextDouble(); //Receive integer. 
		double results = speed*5793.63839954;
		System.out.println("Result: " + results + " km/h");
		in.close();//Close the scanner object to prevent resource leak. 
	}
}
