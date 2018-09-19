/*
S
aa
mmm
pppp
lllll
eeeeee
       
UUUUUUUU
sssssssss
aaaaaaaaaa
ggggggggggg
eeeeeeeeeeee
*/

public class QUESTION1 
{

	public static void main(String[] args) 
	{
		pyramidLetters("Sample Usage");
	}

	public static void pyramidLetters(String pyramid)
	{
		for(int i=0;i<pyramid.length();i++)
		{
			for(int letter=0;letter<=i;letter++)
			{
				System.out.print(pyramid.charAt(i));
			}
			System.out.println();
		}
	}
}
