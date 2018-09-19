
public class EXTRAQUESTION 
{

	public static void main(String[] args) 
	{
		isReverseTheSame("MIMO");
		isReverseTheSame("MOM");
		isReverseTheSame("MOOM");
	}

	public static void isReverseTheSame(String text)
	{
		String inverse = "";
		for(int i=text.length()-1;i>=0;i--)
		{
			inverse = inverse + text.charAt(i);
		}
		
		System.out.println(text.equals(inverse));
	}
}
         