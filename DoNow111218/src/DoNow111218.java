import java.util.Scanner;

public class DoNow111218 
{

	public static void main(String[] args) 
	{
		/*
		System.out.println(caesarCipher("zzzomputer science is awesome",3));
		System.out.println(caesarCipher("Computer science is awesome xxxyyyzzz",5));
		
		Scanner in = new Scanner(System.in);
		System.out.print("Your secret message: ");
		String text = in.nextLine();
		System.out.print("Your secret key: ");
		int key = in.nextInt();
		String encrypted = "";
		for (int i=0;i<=text.length()-2;i++)
		{
			if (text.charAt(i)==' ')
				encrypted += (char)' ';
			else 
				encrypted += (char)(text.charAt(i)+key);
		}
		encrypted.replace("{", "a");
		encrypted.replace("|", "b");
		encrypted.replace("}", "c");
		encrypted.replace("~", "d");
		System.out.println("Your encoded message: " + encrypted);
		*/
	}

	public static int countChar(String text,char keyChar)
	{
		int counter = 0;
		for (int i=0;i<=text.length()-2;i++)
			if (text.charAt(i)==keyChar)
				counter++;
		return counter;
	}
	
	public static String replaceChar(String text,char a,char b)
	{
		String newText = "";
		for (int i=0;i<=text.length()-2;i++)
			if (text.charAt(i)==a)
				newText += b;
			else 
				newText += text.charAt(i);
		return newText;
	}
	
	public static int countString(String text,String keyString)
	{
		return countChar(text,keyString.charAt(0));
	}
	
	public static String caesarCipher(String text,int key)
	{
		String encrypted = "";
		for (int i=0;i<=text.length()-2;i++)
		{
			if (text.charAt(i)==' ')
				encrypted += (char)' ';
			else 
				encrypted += (char)(text.charAt(i)+key);
		}
		encrypted.replace("{", "a");
		encrypted.replace("|", "b");
		encrypted.replace("}", "c");
		encrypted.replace("~", "d");
		return encrypted;
	}
}
