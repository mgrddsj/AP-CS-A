import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class test9 {
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Thread.sleep(10000);
		open("C:\\Users\\13907\\Desktop\\ddd.exe");
		}
	
	public static void open(String targetFilePath) throws IOException
	{
	    Desktop desktop = Desktop.getDesktop();

	    desktop.open(new File(targetFilePath));
	}
}
