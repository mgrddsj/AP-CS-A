
public class client 
{

	public static void main(String[] args) 
	{
		Employee worker = new Employee();
		worker.getHours();
		worker.getSalary();
		worker.getVacationDays();
		worker.getVacationForm();

		Secretary sec = new Secretary();
		sec.getHours();
		sec.getSalary();
		sec.getVacationDays();
		sec.getVacationForm();
		sec.takeDictation("Doing dictation. ");
		sec.organizeDictation();
	}

}
