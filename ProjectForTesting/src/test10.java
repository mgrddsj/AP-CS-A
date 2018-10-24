import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test10 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		call();
		Scanner in = new Scanner(System.in);
		in.nextLine();
	}

	public static void call() throws IOException, InterruptedException
	{
		int x = 10; // wait 2 seconds at most

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		while ((System.currentTimeMillis() - startTime) < x * 1000 && !in.ready()) 
		{
			System.out.println("Time remaining: " + ((10000-(System.currentTimeMillis() - startTime))/1000));
			Thread.sleep(990);
		}

		if (in.ready()) {
		    System.out.println("You entered: " + in.readLine());
		} else {
		    System.out.println("You did not enter data");
		}
		
	}
}

