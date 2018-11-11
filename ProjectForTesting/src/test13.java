
public class test13 
{

	public static void main(String[] args) 
	{
		System.out.println(countTriple("abcXXXabc") + " " + countTriple("xxxabyyyycd") + " " + countTriple("aaaa"));
	}

	public static int countTriple(String text)
	{
		int counter = 0;
		for (int i=0;i<=text.length()-3;i++)
			if (text.charAt(i)==text.charAt(i+1)&&text.charAt(i)==text.charAt(i+2))
				counter++;
		return counter;
	}
}
