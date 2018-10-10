//Exercise 2 on pg.309
public class EXERCISES2 
{

	public static void main(String[] args) 
	{
		System.out.println(repl("Hello",0));
		System.out.println(repl("Hello",6));
	}

	public static String repl(String text,int times)
	{
		String output = "";
		for (int i=1;i<=times;i++)
			output = output + text;
		return output;
	}
}
