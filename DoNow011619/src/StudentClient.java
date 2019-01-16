
public class StudentClient 
{

	public static void main(String[] args) 
	{
		Student Jesse = new Student("Jesse J. Xu",11839,3.6,true);
		System.out.println("Name: " + Jesse.getName());
		System.out.println("Student ID: " + Jesse.getID());
		System.out.println("GPA: " + Jesse.getGPA());
		
		System.out.println();
		Jesse.newGPA(4);
		System.out.println(Jesse.toString());
		
		System.out.println();
		Student Cindy = new Student("Cindy Ye",11848);
		System.out.println(Cindy.toString());
	}

}
