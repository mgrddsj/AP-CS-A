
public class PG312Q18 {

	public static void main(String[] args) 
	{
		System.out.println(wordCount(" this string has wide spaces "));
	}

	public static int wordCount(String text)

	{
	int count = 0;
	int characters = 0;

	for(int i = 0; i < text.length(); i++)
	{
		if(text.charAt(i) == ' ')
		{
			if(characters > 0)
				count++;
			characters = 0;
		}
		else
			characters++;
	} 
	if(characters > 0)
		count++;
	return count;
	}
}
