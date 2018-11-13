
public class DoNow111218 
{

	public static void main(String[] args) 
	{
		System.out.println(caesarCipher("zzzomputer science is awesome",3));
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
			encrypted += (char)(text.charAt(i)+key);
		return encrypted;
	}
}
