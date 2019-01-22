
public class Test17 
{

	public static void main(String[] args) 
	{
		Date d1 = null;
		Date d2 = new Date(1,1,1);
		
		something(d1,d2);
		System.out.println();
	}

	public static void something(Date d1, Date d2)
	{
		d1 = d2;
	}
}

class Date
{
	private int year;
	
	public Date()
	{
		
	}
	
	public Date(int mo,int da,int yr)
	{
		
	}
	
	public int year()
	{
		return year;
	}
}