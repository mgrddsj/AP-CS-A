
public class AdvanceTicket extends Ticket
{

	public AdvanceTicket(int inputNum, int daysBeforeEvent) 
	{
		super(inputNum);
		if (daysBeforeEvent < 10)
		{
			setPrice(30.0);
		}
		else 
		{
			setPrice(40.0);
		}
	}

}
