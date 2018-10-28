import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher2 
{

	public static void main(String[] args) throws IOException, Exception 
	{
		System.out.println("Please wait... Loading program...");
		String processName = "room2.exe";
		
		while (true)
		{
			if (!isProcessRunning(processName))
				open("D:\\Halloween\\Cmder - room2.lnk");
			Thread.sleep(1000);
		}
	}

	public static void open(String targetFilePath) throws IOException
	{
	    Desktop desktop = Desktop.getDesktop();

	    desktop.open(new File(targetFilePath));
	}
	
	private static final String TASKLIST = "tasklist";
	private static final String KILL = "taskkill /F /IM ";

	public static boolean isProcessRunning(String serviceName) throws Exception 
	{

	 Process p = Runtime.getRuntime().exec(TASKLIST);
	 BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
	 String line;
	 while ((line = reader.readLine()) != null) 
	 {
		  if (line.contains(serviceName)) 
			  return true;
	 }

	 return false;

	}

	public static void killProcess(String serviceName) throws Exception 
	{
	  Runtime.getRuntime().exec(KILL + serviceName);
	}
	
}
