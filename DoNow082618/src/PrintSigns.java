
public class PrintSigns 
{

	public static void main(String[] args) 
	{
		drawDot();
		drawDot();
		drawQuestionMark();	
		drawDot();
		drawExclamationMark();
	}
	
	public static void drawExclamationMark()
	{
		System.out.println("!!!!");
		System.out.println("!!!!");
		System.out.println("!!!!");
		System.out.println("!!!!");
		System.out.println("!!!!");
		System.out.println("!!!!\n");
		System.out.println("!!!!");
	}
	
	public static void drawQuestionMark()
	{
		System.out.println("??");
		System.out.println("??\t\t??");
		System.out.println("??\t??");
		System.out.println("\t??");
		System.out.println("??");
		System.out.println("??");
		System.out.println("??\n");
		System.out.println("??");
	}
	
	public static void drawDot()
	{
		System.out.println("....");
		System.out.println("....\t....");
		System.out.println("....\t\t....");
		System.out.println("....\t....");
		System.out.println("....");
	}
	
}
