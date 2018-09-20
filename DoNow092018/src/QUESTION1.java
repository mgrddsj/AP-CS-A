
public class QUESTION1 
{

	public static void main(String[] args) 
	{
		spaceAndPyramid("abcdefg");
	}

	public static void spaceAndPyramid(String text)
	{
		for(int i=0;i<=text.length();i++)
		{
			for(int firstSpaces=0;firstSpaces<i;firstSpaces++)
			{
				System.out.print(" ");
			}
			
			System.out.print(text.substring(0+i, text.length()-i));
			
			for(int lastSpaces=0;lastSpaces<i;lastSpaces++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
