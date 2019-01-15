import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class DoNow 
{

	public static void main(String[] args) 
	{
		/*
		int a;
		String b;

		System.out.print(a);
		System.out.print(b);
		 */

		Account c = new Account("Jesse",10000000);
		System.out.println(c);

		Account d = new Account("Cindy", 0);
		System.out.println(d);

		c.takeOut(100);
		/*
		Scanner in = new Scanner(System.in);
		System.out.println(in);

		int[] array = new int[5];
		System.out.println(array);

		String[] str = new String[5];
		System.out.println(str);

		Random rand = new Random();
		System.out.println(rand);
		 */

	}

}

class Account 
{
	private double value;
	private String owner;

	public Account(String initOwner,double initValue)
	{
		value = initValue;
		owner = initOwner;
	}

	public void deposit(double in)
	{
		value += in;
	}

	public void takeOut(double out)
	{
		value -= out;
	}

	public double check()
	{
		return value;
	}

	public String getOwner()
	{
		return owner;
	}


	public String toString()
	{
		if (value > 10000)
			return "Hello, " + owner + "! You now have $" + value + ", that's a lot of money :)";
		else 
			return "Hello, " + owner + "! You only have $" + value + ", work hard and earn some money! ";
	}

}
