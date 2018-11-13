//String: Yhxr V nz lbhe sngure
import java.util.Scanner;

public class DoNow_TryToDecipher 
{

	public static void main(String[] args) 
	{
		//tryToDecipher();
		Scanner in = new Scanner(System.in);
		System.out.print("String? ");
		String text = in.nextLine();
		for (int key=-50;key<=50;key++)
			System.out.println(decrypt(text,key));
	}

	/*
	public static void tryToDecipher()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("String? ");
		String text = in.nextLine();
		boolean finished = false;
		while (!finished)
		{
			//System.out.print("key?");
			int key = in.nextInt();
			System.out.println(decrypt(text,key));
			//System.out.print("Does this look correct? ");
			//if (in.nextBoolean()==true)
				//finished = true;
		}
	}
	*/
	
	public static String decrypt(String text,int key)
	{
		String answer = "";
		for (int i = 0;i<=text.length()-1;i++)
		{
			if (text.charAt(i)==' ')
				answer += ' ';
			else if (text.charAt(i)<=97)
			{
				if (text.charAt(i)+key>=91)
					answer += (char)(text.charAt(i)+key-26);
				else if (text.charAt(i)+key<=60)
					answer += (char)(text.charAt(i)+key+26);
				else
					answer += (char)(text.charAt(i)+key);
			}
			else
			{
				if (text.charAt(i)+key>=123)
					answer += (char)(text.charAt(i)+key-26);
				else if (text.charAt(i)+key<=96)
					answer += (char)(text.charAt(i)+key+26);
				else
				answer += (char)(text.charAt(i)+key);
			}
		}

		return answer;
	}
}
