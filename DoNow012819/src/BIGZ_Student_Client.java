
public class BIGZ_Student_Client 
{

	public static void main(String[] args)
	{
		String[] subjects = {"Math", "Physics", "AP CS"};//Some subjects to be used later. 

		BIGZ_Student Someone = new BIGZ_Student();//Initialize an object with no parameter. 

		//Initialize 2 objects with 3 parameters. 
		BIGZ_Student Cindy = new BIGZ_Student("Cindy", 10, subjects);
		BIGZ_Student Jesse = new BIGZ_Student("Jesse", 10, subjects);

		//Call 3 accessor methods from 3 objects. 
		Someone.getSubjects();
		Cindy.getSubjects();
		Jesse.getSubjects();

		//Call 3 mutator methods. 
		Someone.upgrade();
		Cindy.dropClass(1);
		Jesse.changeName("Jesse J. Xu");
	}

	public static void doSomethingToStudents(BIGZ_Student[] allStudents)
	{

	}
}
