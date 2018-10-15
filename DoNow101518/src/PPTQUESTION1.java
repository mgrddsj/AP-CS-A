import java.util.Scanner;

public class PPTQUESTION1 {

	public static void main(String[] args) {
		String keyword = "quit";
		Scanner in = new Scanner(System.in);
		int characters = 0; 
		String input = "";
		
		while (!input.equals(keyword))
		{
			System.out.print("Type a line (or \"quit\" to exit):");
			input = in.nextLine();
			characters += input.length();
		}
		
		System.out.println("You typed a total of " + characters + " characters. ");
		in.close();
	}

}
