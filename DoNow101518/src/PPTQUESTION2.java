import java.util.Scanner;

public class PPTQUESTION2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0; 
		int inputednum = 0;
		
		while (inputednum>=0)
		{
			System.out.print("Give me a number to add (or give negative to exit): ");
			inputednum = in.nextInt();
			sum += inputednum;
		}
		
		System.out.println("Your total is " + sum);
		in.close();
	}

}
