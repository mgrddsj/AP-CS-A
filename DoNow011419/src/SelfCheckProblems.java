import java.awt.Point;

//PG.578
public class SelfCheckProblems 
{

	public static void main(String[] args) 
	{

	}

	public static void problem1()
	{
		/*
		 * Procedural programming means to write a program that runs line by line, from top to bottom. 
		 * Object-oriented programming uses objects and classes. 
		 */
	}

	public static void problem2()
	{
		/*
		 * An object is a programming entity that contains state and behavior. 
		 * Objects have state and behavior, but classes doesn't. 
		 */
	}

	public static void problem3()
	{
		/*
		 * State: the data in the string object created. 
		 * Behavior: charAt, indexOf, isEmpty, etc. 
		 */
	}

	public static void problem4()
	{
		/*
		 * 14 14
		 * 7 9 14 2
		 * 18 18
		 * 7 9 14 18
		 */
	}

	public static void problem5()
	{
		/*
		 * State: result (double)
		 * Behavior: add, minus, times, divide, getAnswer(equal), clear. 
		 */
	}

	public static void problem6()
	{
		/*
		 * Field is a variable inside an object that makes up part of its internal state. 
		 * Parameter is the variable that is being refered during an instance method call. 
		 */
	}

	public static void problem7()
	{
		//See class "Name"
	}

	public static void problem8()
	{
		/*
		 * A mutator is an instance method that modifies the object's internal state. 
		 * An accessor is an instance method that provides information about the state of an object without modifying it. 
		 * 
		 * Naming conventions: 
		 * 	Mutator: setXX
		 * 	Accessor: length, exists, etc. 
		 */
	}

	public static void problem9()
	{
		// D
	}

	public double problem10_distance(Point p1, Point p2)
	{
		return Math.sqrt(Math.pow((p1.x-p2.x), 2) + Math.pow(p1.y-p2.y, 2));
	}

	public static void problem11()
	{
		//See class "Name"
	}

	public static void problem12()
	{
		/*
		 * Write a client program / Write some accessors.
		 */
	}

	public static void problem13()
	{
		//D
	}

	public String problem14_toString(Point p)
	{
		return "java.awt.Point[ x=" + p.x + ",y=" + p.y + "] ";
	}

	public static void problem15()
	{
		//See class "Name"
	}
}

class Name
{
	private String firstName;
	private String lastName;
	private char middleInitial;

	//problem 11
	public String getNormalOrder()
	{
		return firstName + " " + middleInitial + ". " + lastName;
	}

	public String getReverseOrder()
	{
		return lastName + " " + firstName + " " + middleInitial + ". ";
	}

	public String toString()
	{
		return firstName + " " + middleInitial + ". " + lastName;
	}
}