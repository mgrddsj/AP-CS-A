

/*
ABC
ABCABC
ABCABCABC
ABCABCABCABC
ABCABCABCABCABC
 */

public class DONOW2 
{

	public static void main(String[] args) 
	{
		String abc = "ABC";
		for (int i=1;i<=5;i++)
		{
			System.out.println(abc);
			abc += "ABC";
		}
	}

}
