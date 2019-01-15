import java.math.BigDecimal;

public class DoNow 
{

	public static void main(String[] args) 
	{
		/*
		int a;
		String b;

		System.out.print(a);
		System.out.print(b);
		*/

		Account c = new Account("Jesse",10000000);
		System.out.print(c.toString());
	}

}

class Account 
{
    private double value;
    private String owner;
    
    public Account(String initOwner,double initValue)
    {
        value = initValue;
        owner = initOwner;
    }

    public void deposit(double in)
    {
        value += in;
    }

    public void takeOut(double out)
    {
        value -= out;
    }

    public double check()
    {
        return value;
    }

    public String getOwner()
    {
        return owner;
    }
}
