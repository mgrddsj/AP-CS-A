
public class Student {

    private String stuName;
    private int stuID;
    private double stuGPA;
    private boolean isBoarder;

    public Student(String inputName,int inputID,double inputGPA,boolean inputBoarder)
    {
        stuName = inputName;
        stuID = inputID;
        stuGPA = inputGPA;
        isBoarder = inputBoarder;
    }

    public Student(String inputName,int inputID)
    {
        stuName = inputName;
        stuID = inputID;
        stuGPA = 1.0;
        isBoarder = false;
    }

    public String getName()
    {
        return stuName;
    }

    public int getID()
    {
        return stuID;
    }

    public double getGPA()
    {
        return stuGPA;
    }

    public void newGPA(double inputGPA)
    {
        stuGPA = inputGPA;
    }

    public boolean isBoarder()
    {
        return isBoarder;
    }

    public String toString()
    {
        return "Name: " + stuName + "\nStudent ID: " + stuID + "\nGPA: " + stuGPA + "\nBoarder: " + isBoarder;
    }
}
