
import java.util.Scanner;

public class PRACTICEINCLASS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many people ate? ");
		int people = in.nextInt();
		double subTotal = 0;
		for(int i=1;i<=people;i++)
		{
			System.out.print("Person #" + i + ": How much did your dinner cost? ");
			subTotal = subTotal + in.nextDouble();
		}
		System.out.println("Subtotal: " + subTotal);
		double tax = subTotal * 0.8;
		System.out.println("Tax: " + tax);
		double tip = subTotal * 0.15;
		System.out.println("Tips: " + tip);
		
		System.out.println("Total: " + (subTotal + tax + tip));

		in.close();
	}

}

