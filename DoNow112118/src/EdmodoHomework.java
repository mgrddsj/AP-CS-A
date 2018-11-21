import java.util.Random;
import java.util.Scanner;

public class EdmodoHomework 
{

	public static void main(String[] args) 
	{
		quiz();
	}

	public static void quiz()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many questions in the quiz? ");
		int questionCount = in.nextInt();
		char[] answer = new char[questionCount];
		int correctCount = 0;
		Random rand = new Random();
		
		for (int i=0;i<questionCount;i++)
		{
			answer[i] = (char)(rand.nextInt(5)+65);
		}
		
		System.out.println("Answer to be graded? ");
		String answerInput = in.nextLine();
		
		for (int i=0;i<questionCount;i++)
		{
			if (answerInput.charAt(i) == answer[i])
				correctCount++;
		}
		
		System.out.println("Number of correct answers: " + correctCount);
		System.out.println("Percentage of correct answers: " + (((double)correctCount/(double)questionCount)*100) + "%");
	}
}
