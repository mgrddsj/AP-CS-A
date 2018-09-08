//Name: Jesse Xu
//Last changed: 24.08.2018
/*Description: 
 This is the homework for 2018.8.25, 
 This program will output a user name that was inputted by the user, 
 and print some special characters.*/

import java.util.Scanner;
public class HelloUser
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); //Creates a scanner object. 
		System.out.print("Please enter your name: "); //Notify the user to input his/her name. 
		String userName = in.next(); //Read the input and assign it to string userName
		System.out.println("Hi " + userName); //Prints "Hi" and then the user name. 
		System.out.println("this is quote \"\nthis is slash /."); //Prints special characters " and /. 
		in.close();//Close the scanner object to prevent resource leak. 
	}

}
