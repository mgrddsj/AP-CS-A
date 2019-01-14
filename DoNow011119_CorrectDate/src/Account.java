import java.math.BigDecimal;

public class Account 
{
    private double value;
    private String owner;
    
    public Account(String initOwner,double initValue)
    {
        BigDecimal value = new BigDecimal(initValue);
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
