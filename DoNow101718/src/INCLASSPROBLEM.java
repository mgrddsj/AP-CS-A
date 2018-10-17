import java.util.*;
public class INCLASSPROBLEM {

	public static void main(String[] args) {
		Random rand = new Random();
		int sum = 0;
		int key = 7;
		int times = 0;
		while (sum!=key)
		{
			int num1 = rand.nextInt(6)+1;
			int num2 = rand.nextInt(6)+1;
			sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum);
			times++;
		}
		System.out.println("You won after " + times + " times. " );
	}

}
