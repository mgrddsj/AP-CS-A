package doNow083018;

public class DONOW083018 
{

	public static void main(String[] args) 
	{
		headerOfSheet();
		sheetData();
	}

	public static void headerOfSheet()
	{
		System.out.println("/////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("==\t\tStudent Points\t\t==");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\/////////////////////");
		System.out.println();
		System.out.println("Name\t\tLab\tBonus\tTotal");
		System.out.println("----\t\t---\t-----\t-----");
	}
	
	public static void sheetData()
	{
		System.out.println("Joe\t\t43\t7\t50");
		System.out.println("William\t\t50\t8\t58");
		System.out.println("Mary Sue\t39\t10\t49");
	}
	
}
