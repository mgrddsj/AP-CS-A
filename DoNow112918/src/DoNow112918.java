import java.util.Arrays;
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
		for (int i=0;i<text.length();i++)
		{
			if (text.charAt(i) == ' ')
				spaces++;
		}
		
		String[] words = new String[spaces];
		int counter = 1;
		
		words[0] = text.substring(0, text.indexOf(" "));
		
		for (int i=0;i<text.length()-2;i++)
		{
			if (text.charAt(i) == ' ')
			{
				words[counter] = text.substring(i, (text.substring(i+1)).indexOf(" ")+i+1);
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
		
		System.out.println(Arrays.toString(words));
	}
}
