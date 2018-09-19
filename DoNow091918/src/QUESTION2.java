/*
elpmaS
elpma
elpm
elp
el
e
 */
public class QUESTION2 
{

	public static void main(String[] args) 
	{
		inversePyramid("Sample");
	}

	public static void inversePyramid(String pyramid)
	{
		//Put the inverse order of the string pyramid into a string named inverse
		String inverse="";
		for(int i=pyramid.length()-1;i>=0;i--)
		{
			inverse = inverse + pyramid.charAt(i);
		}
		
		//print out the string inverse in pyramid shape
		for(int i = inverse.length();i>=1;i--)
		{
			System.out.println(inverse.substring(0, i));
		}
	}
}
