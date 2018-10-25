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
			if (	("" + text.charAt(i)).equals("a")||
					("" + text.charAt(i)).equals("e")||
					("" + text.charAt(i)).equals("i")||
					("" + text.charAt(i)).equals("o")||
					("" + text.charAt(i)).equals("u"))
				vowels++;
		}
		
		System.out.println("vowels = " + vowels);
	}
}
