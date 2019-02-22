
public class LegalSecretary extends Secretary
{
    public String efficiency;
    private String efficiencyInReality;

    public Secretary()
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

    public void increaseEfficiency()
    {
        System.out.println("Let me finish watching this YouTube video... ");
    }

}
