
public class QUESTION3 {

	public static void main(String[] args) {
		multiplier();
	}

	public static void multiplier()
	{
		long results = 1;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0||i%3==0)
				results*=i;
		}
		System.out.println(results);
	}
}
