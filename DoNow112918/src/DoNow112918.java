import java.util.Scanner;

public class DoNow112918 
{

	public static void main(String[] args) 
	{
		checkSentence();
	}

	public static void checkSentence()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input the sentence: ");
		String text = in.nextLine();
		
		int spaces = 0;
		for (int i=0;i<text.length()-1;i++)
		{
			if (text.charAt(i) == ' ')
				spaces++;
		}
		
		char[] firstLetters = new char[spaces];
		int counter = 0;
		
		for (int i=0;i<text.length()-1;i++)
		{
			if (text.charAt(i) == ' ')
			{
				firstLetters[counter] = text.charAt(i+1);
				counter++;
			}
		}
		
		if (text.indexOf(".") != -1)
			System.out.println("Declarative sentence! ");
		else if (text.indexOf("!") != -1)
			System.out.println("Exclamation sentence! ");
		else if (text.indexOf("?") != -1)
			System.out.println("Questioning sentence! ");
		else 
			System.out.println("You don't know how to add punctuation marks? ");
	}
}
