
public class Ticket 
{
    private int number;
    private double price = 50.0;

    public Ticket(int inputNum) 
    {
        number = inputNum;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        return "Number: " + number + " Price per ticket: $" + getPrice();
    }

	public void setPrice(double price) 
	{
		this.price = price;
    }

}
