
public class Marketer extends Employee
{
    public boolean hasGreatIdeas;
    private int numOfIdeas;

    public Employee()
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

}
