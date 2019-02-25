
public class Test 
{

	public static void main(String[] args) 
	{

		Employee employee = new Employee();
		Employee lawyer = new Lawyer();

		System.out.println(employee.getHours());
		System.out.println(lawyer.getHours());
		System.out.println(employee.getVacationForm());
		System.out.println(lawyer.getVacationForm());
//		employee.sue("Someone");
		lawyer.sue("Someone");

	}

}
