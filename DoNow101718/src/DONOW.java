import java.util.Scanner;

public class DONOW {

	public static void main(String[] args) {
		String keyword = "Basis";
		Scanner in = new Scanner(System.in);
		String input = "";
		int numOfGuess = 0;
		
		while (!input.equals(keyword))
		{
			System.out.print("Hint: 5 characters, name of a school");
			input = in.nextLine();
			if (input.length()<keyword.length())
			{
				System.out.println("Error!!! Exiting... ");
				return;
			}
			System.out.println(compare(input,keyword));
			numOfGuess++;
		}
		
		System.out.println("You guessed it successfully! ");
		System.out.println("You guessed " + numOfGuess + " times. ");
		in.close();
	}

	public static String compare(String input,String key)
	{
		String hint = "";
		for (int i=0;i<key.length();i++)
		{
			if (("" + input.charAt(i)).equals("" + key.charAt(i)))
				hint += key.charAt(i);
			else 
				hint += "X";
		}
		return hint;
	}
}

