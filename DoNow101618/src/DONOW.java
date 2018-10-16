import java.util.Scanner;

public class DONOW {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		int switcher = 0;
		
		while (switcher==0)
		{
			System.out.print("Type a line: ");
			input = in.nextLine();
			if (isReverseTheSame(input))
				switcher = 1;
		}
		
		System.out.println("Palindrome word!!! ");
		in.close();

	}
	
	public static boolean isReverseTheSame(String text)
	{
		String inverse = "";
		for(int i=text.length()-1;i>=0;i--)
		{
			inverse = inverse + text.charAt(i);
		}
		
		return (text.equals(inverse));
	}

}
