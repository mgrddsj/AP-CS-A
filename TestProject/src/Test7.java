import java.util.Random;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		guessingGame();
	}

	public static void guessingGame()
	{
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		
		int key=rand.nextInt(100)+1;
		int answer=0;
		int trials=0;
		
		System.out.println("Please guess the number (range 1-100): ");
		while(answer!=key)
		{
			answer = in.nextInt();
			if (answer>key)
				System.out.println("It is too high! ");
			else if (answer<key)
				System.out.println("It is too low! ");
			trials++;
		}
		
		System.out.println("Congratulations!!! The correct number is "+ key + ". ");
		System.out.println("It took you " + trials + " times to get the correct answer. ");
		in.close();
	}
}
