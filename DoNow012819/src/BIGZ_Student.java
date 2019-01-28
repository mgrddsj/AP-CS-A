
public class BIGZ_Student
{
    //Basic information of the student. 
    private String stuName;
    private int grade;
    private String[] subjects;

    // A constructor with no parameters.
    public BIGZ_Student()
    {
        
    }

    //A constructor with 3 parameters. It initializes the basic information for the BIGZ student. 
    public BIGZ_Student(String inputName, int inputGrade, String[] inputSubjects)
    {
        stuName = inputName;
        grade = inputGrade;
        subjects = inputSubjects;
    }

    //An accessor method to get the student's name. 
    public String getName()
    {
        return stuName;
    }

    //An accessor method that gets which grade the student is at. 
    public String getGrade()
    {
        return "G" + grade; 
    }

    //An accessor method that get the subjects of the student in a String array. 
    public String[] getSubjects()
    {
        return subjects;
    }

    //A mutator method that change the student's name in case there's a typo during initialization. 
    public changeName(String newName)
    {
        stuName = newName;
    }

    //A mutator method that make the grade of the student up.
    public upgrade()
    {
        grade++;
    }

    //A mutator method that allow the student to drop a class. Which will delete the subject in the array. 
    public dropClass(int classNum)
    {
        subjects[classNum] = "";
    }

    public static void tortureMode(boolean isTorturing)
    {
        //A static method that sets if the student need to be tortured. 
        //However, it does nothing. Which means that a student can never stop the torture. 
    }

    //Describes the student in natural language. 
    public String toString()
    {
        return "This is a G" + grade + " student named " + stuName + " in BIGZ. This student is learning " + subjects.length + " subjects. ";
    }
}
