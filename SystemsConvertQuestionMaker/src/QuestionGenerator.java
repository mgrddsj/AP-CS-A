import java.io.*;
import java.util.Scanner;

public class QuestionGenerator {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in); 
		System.out.println("From what system? ");
		int initialSystem = in.nextInt();
		System.out.println("To what system? (Random from 1-20 if input -1) ");
		int destSystem = in.nextInt();
		System.out.println("How many digits? ");
		int digits = in.nextInt();
		System.out.println("How many questions? ");
		int qCount = in.nextInt();
		
		PrintStream Test = new PrintStream(new File("Test.txt"));
		Test.println("Test File");
	}

	public static void process(int initSys,int destSys,int digits,int qCount) throws FileNotFoundException
	{
		PrintStream questions = new PrintStream(new File("Questions.txt"));
		PrintStream answers = new PrintStream(new File("Answers.txt"));
		for (int i=1;i<=qCount;i++)
		{
			
		}
	}
}
