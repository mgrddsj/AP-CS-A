import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Homework111518 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		//decrypt("anu vvrwj jcfg");
		readFileAndFind5Char();
	}

	public static void decrypt(String text)
	{
		Random rand = new Random();
		while (true)
		{
			String answer = "";
			int key = rand.nextInt(54)-26;
			for (int i = 0;i<=text.length()-1;i++)
			{
				int k;
				if (rand.nextBoolean())
					k = -key;
				else
					k = key;
				if (text.charAt(i)==' ')
					answer += ' ';
				else if (text.charAt(i)<=97)
				{
					if (text.charAt(i)+k>=91)
						answer += (char)(text.charAt(i)+k-26);
					else if (text.charAt(i)+k<=60)
						answer += (char)(text.charAt(i)+k+26);
					else
						answer += (char)(text.charAt(i)+k);
				}
				else
				{
					if (text.charAt(i)+k>=123)
						answer += (char)(text.charAt(i)+k-26);
					else if (text.charAt(i)+k<=96)
						answer += (char)(text.charAt(i)+k+26);
					else
					answer += (char)(text.charAt(i)+k);
				}
			}
	
			System.out.println(answer);
		}
	}
	
	public static void readFileAndFind5Char() throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
        File file = new File("wordlist.txt");
        input = new Scanner(file);
        String line = "";
        while (input.hasNextLine()) {
            line = input.nextLine();
            //System.out.println(line);
        }
        input.close();
        
        for (int i=0;i<=line.length()-1;i++)
        {
        	if (line.charAt(i)==line.charAt(i+1))
        	{
        		if (line.charAt(i-1)==' ')
        			System.out.println(line.substring(i, i+5));
        	}
        }
        
	}
}
