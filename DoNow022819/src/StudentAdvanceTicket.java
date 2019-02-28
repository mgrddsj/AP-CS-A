
public class StudentAdvanceTicket extends AdvanceTicket
{

	public StudentAdvanceTicket(int inputNum, int daysBeforeEvent) 
	{
		super(inputNum, daysBeforeEvent);
        if (daysBeforeEvent < 10)
		{
			setPrice(15.0);
		}
		else 
		{
			setPrice(20.0);
		}
	}
    
}
