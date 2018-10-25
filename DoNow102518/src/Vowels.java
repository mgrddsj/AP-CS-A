import java.util.Scanner;

public class Vowels 
{

	public static void main(String[] args) 
	{
		vowels();
	}

	public static void vowels()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input a sentence: ");
		String text = "";
		int vowels = 0;
		while (text.indexOf(".")==-1)
		{
			text += in.next();
		}
		
		for (int i = 0;i<=text.length()-1;i++)
		{
			if (	("" + text.charAt(i)).equalsIgnoreCase("a")||
					("" + text.charAt(i)).equalsIgnoreCase("e")||
					("" + text.charAt(i)).equalsIgnoreCase("i")||
					("" + text.charAt(i)).equalsIgnoreCase("o")||
					("" + text.charAt(i)).equalsIgnoreCase("u"))
				vowels++;
		}
		
		System.out.println("vowels = " + vowels);
		in.close();
	}
}
