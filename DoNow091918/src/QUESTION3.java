
public class QUESTION3 
{

	public static void main(String[] args) 
	{
		weirdPyramid("Laptop");
	}

	public static void weirdPyramid(String text)
	{
		for(int counter=0;counter<=text.length();counter++)
		{
			for (int order = counter; order > 0; order--) {
				System.out.print(text.charAt(text.length()-1-order));
			}
			
			System.out.print(text.charAt(text.length()-1));
			
			for(int inverseOrder=0;inverseOrder<counter;inverseOrder++)
			{
				System.out.print(text.charAt(text.length()-2-inverseOrder));
			}
			
			System.out.println();
		}
	}
}
