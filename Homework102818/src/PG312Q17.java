
public class PG312Q17 {

	public static void main(String[] args) {
		System.out.println(stutter("Hello"));
	}

	public static String stutter(String text)
	{
		String result = "";
		for (int i=0;i<=text.length()-1;i++)
		{
			result +=text.charAt(i);
			result +=text.charAt(i);
		}
		return result;
	}
}
