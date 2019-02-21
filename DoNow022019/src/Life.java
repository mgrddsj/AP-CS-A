
public class Life 
{
    private String nameOfPerson;
    private String status;
    
    public Life(String name, int something)
    {
        nameOfPerson = name;
        status = "happy";
    }

    public Life(double something)
    {
        nameOfPerson = "No name";
        status = "down";
    }

    public Life(String anything)
    {
        nameOfPerson = "I don't know";
        status = "sucks";
    }

}
