
public class HarvardLawyer extends Lawyer
{

    public double salary = super.salary * 1.2;
    public int vacationDays = super.vacationDays + 3;

    public String getVacationForm()
    {
        return "pinkpinkpinkpink";
    }
}
