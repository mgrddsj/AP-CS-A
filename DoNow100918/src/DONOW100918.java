
public class DONOW100918 
{

	public static void main(String[] args) 
	{
		numbersBetween(1,99,6);
	}

	public static void numbersBetween(int first,int second,int third)
	{
		
		if(third%2==0)
		{
			if(first%2!=0)
				first++;
		}
		else
		{
			if(first%2==0)
				first++;
		}
		
		for(int i=first;i<=second;i+=2)
		{
			System.out.print(i + " ");
		}
		
	}
	
}
