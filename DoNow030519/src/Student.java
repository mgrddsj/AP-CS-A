
public class Student 
{
    private double GPA;

    public Student(double _GPA)
    {
        GPA = _GPA;
    }

    public double getGPA()
    {
        return GPA;
    }

    public boolean equals(Object _stu)
    {
        if (_stu.getClass(). == GPA)
            return true;
        return false;
    }
}
