
public class client 
{

	public static void main(String[] args) 
	{
		Employee worker = new Employee();
		System.out.println(worker.getHours());
		System.out.println(worker.getSalary());
		System.out.println(worker.getVacationDays());
		System.out.println(worker.getVacationForm());
		System.out.println();

		Secretary sec = new Secretary();
		System.out.println(sec.getHours());
		System.out.println(sec.getSalary());
		System.out.println(sec.getVacationDays());
		System.out.println(sec.getVacationForm());
		sec.takeDictation("Doing dictation. ");
		sec.organizeDictation();
		System.out.println();

		Lawyer lawyer = new Lawyer();
		System.out.println(lawyer.getHours());
		System.out.println(lawyer.getSalary());
		System.out.println(lawyer.getVacationDays());
		System.out.println(lawyer.getVacationForm());
		lawyer.sue("Mr. nobody");
		System.out.println();

		LegalSecretary legalSecretary = new LegalSecretary();
		System.out.println(legalSecretary.getHours());
		System.out.println(legalSecretary.getSalary());
		System.out.println(legalSecretary.getVacationDays());
		System.out.println(legalSecretary.getVacationForm());
		legalSecretary.takeDictation("Doing dictation. ");
		legalSecretary.organizeDictation();
		legalSecretary.fileLegalBriefs();
		System.out.println();

		Marketer marketer = new Marketer();
		System.out.println(marketer.getHours());
		System.out.println(marketer.getSalary());
		System.out.println(marketer.getVacationDays());
		System.out.println(marketer.getVacationForm());
		marketer.advertise();
		System.out.println();
	}

}
