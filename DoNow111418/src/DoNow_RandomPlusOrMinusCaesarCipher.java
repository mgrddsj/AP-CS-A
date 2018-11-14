import java.util.Random;

public class DoNow_RandomPlusOrMinusCaesarCipher {

	public static void main(String[] args) 
	{
		
	}

	public static String caesarCipher(String text,int key)
	{
		Random rand = new Random();
		String encrypted = "";
		for (int i=0;i<=text.length()-2;i++)
		{
			int k;
			if (rand.nextBoolean())
				k = key;
			else 
				k = -key;
			
			if (text.charAt(i)<=97)
			{
				if (text.charAt(i)+k>=91)
					encrypted += (char)(text.charAt(i)+k-26);
				else if (text.charAt(i)+k<=60)
					encrypted += (char)(text.charAt(i)+k+26);
				else
					encrypted += (char)(text.charAt(i)+k);
			}
			else
			{
				if (text.charAt(i)+k>=123)
					encrypted += (char)(text.charAt(i)+k-26);
				else if (text.charAt(i)+k<=96)
					encrypted += (char)(text.charAt(i)+k+26);
				else
					encrypted += (char)(text.charAt(i)+k);
			}
		}
		return encrypted;
	}
	
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
	
	public static void tryToDecrypt(String text,int key)
	{
		while (true)
		{
			decrypt(text,key);
		}
	}
}
