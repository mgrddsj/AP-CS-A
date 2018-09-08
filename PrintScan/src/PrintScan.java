// Name: Miro
// Last Changed: 23.08.2018
// Description: gets input from the user
//This is an example from Mr. Miro

import java.util.Scanner;

public class PrintScan {

	public static void main(String[] args) 
	{
		String s = "Hello, This is JavaTpoint."; 
		//Create scanner Object and pass string in it 
		Scanner scan = new Scanner(s); 
		//Check if the scanner has a token 
		System.out.println("Boolean Result: " + scan.hasNext()); 
		//Print the string 
		System.out.println("String: " +scan.nextLine()); 
		scan.close(); 
		System.out.println("--------Enter Your Details-------- "); 
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter your name: "); 
		String name = in.next(); 
		System.out.println("Name: " + name); 
		System.out.print("Enter your age: "); 
		int i = in.nextInt(); 
		System.out.println("Age: " + i); 
		System.out.print("Enter your salary: "); 
		double d = in.nextDouble(); 
		System.out.println("Salary: " + d); 
		in.close();
	}

}
