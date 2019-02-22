
public class Marketer extends Employee
{
    public boolean hasGreatIdeas;
    private int numOfIdeas;

    public Marketer()
    {
        hasGreatIdeas = true;
        numOfIdeas = 0;
    }

    public double getSalary()
    {
        return 50000.0;
    }

    public void advertise()
    {
        System.out.println("Advertising the company... ");
        System.out.println("Works great! ");
    }

    private void getSomeIdeas()
    {
        System.out.println("Let me see some designs on Pinterest. ");
    }

    //Try to call private behavior of Employee
    private void callPrivateMethod()
    {
    	//super.addSickDays();	Not able to call. 
    }
    
}
