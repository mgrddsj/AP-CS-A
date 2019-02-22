
public class LegalSecretary extends Secretary
{
    public String efficiency;
    private String efficiencyInReality;

    public LegalSecretary()
    {
        efficiency = "fast";
        efficiencyInReality = "slow";
    }

    public double getSalary()
    {
        return 45000.0;
    }

    public void fileLegalBriefs()
    {
        System.out.println("Filing... ");
    }

    private void increaseEfficiency()
    {
        System.out.println("Let me finish watching this YouTube video first... ");
    }

    private void accessPublicField()
    {
    	//There's a spring board in Secretary class. 
        System.out.println(super.springBoard());
    }

}
