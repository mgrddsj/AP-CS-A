import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11 {

	public static void main(String[] args) throws IOException, InterruptedException {
		call();
	}

	public static void call() throws IOException, InterruptedException
	{
		int x = 180; // wait 180 seconds at most

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long startTime = System.currentTimeMillis();
		String input = "";
		while ((System.currentTimeMillis() - startTime) < x * 1000 && !in.ready()) 
		{
			cls();
			System.out.println("Time remaining: " + ((180000-(System.currentTimeMillis() - startTime))/1000) + "s");
			System.out.println("Command: " + input);
			Thread.sleep(999);
		}

		if (in.ready()) {
		    input += in.readLine();
		} else {
		    System.out.println("You did not finish it! Bad luck! ");
		}
	}
	
	public static void cls() throws InterruptedException, IOException
	{
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}
