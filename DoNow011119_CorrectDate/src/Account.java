import java.math.BigDecimal;

public class Account 
{
	private BigDecimal value = new BigDecimal(0);
    private String owner;
    
    public Account(String initOwner,double initValue)
    {
    	BigDecimal initValueBig = new BigDecimal(initValue);
    	value = BigDecimal.add(initValueBig);
        owner = initOwner;
    }

    public void deposit(double in)
    {
        value = value.add(in);
    }

    public void takeOut(double out)
    {
        value = value.subtract(out);
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
