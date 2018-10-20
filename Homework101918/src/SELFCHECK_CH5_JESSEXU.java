import java.util.Random;
import java.util.Scanner;

public class SELFCHECK_CH5_JESSEXU 
{

	public static void main(String[] args) 
	{
		problem13();
	}

	public static void problem1()
	{
		/*
		a.	10
		b.	0
		c.	infinity
		d.	3
		e.	5
		f.	8
		 */
	}
	
	public static void problem2_a()
	{
		int n=1;
		int max=0;//Created int max to avoid warning. Not specified in the question. 
		while(n<=max)
		{
			System.out.println(n);
			n++;
		}
	}
	
	public static void problem2_b()
	{
		int total=25;
		int number=1;
		while(number<=(total/2))
		{
			total-=number;
			System.out.println(total + " " + number);
			number++;
		}
	}
	
	public static void problem2_c()
	{
		int i=1;
		while(i<=2)
		{
			int j=1;
			while(j<=3)
			{
				int k=1;
				while(k<=4)
				{
					System.out.println("*");
					k++;
				}
				j++;
			}
			i++;
		}
	}
	
	
	public static void problem2_d()
	{
		int number=4;
		int count=1;
		while(count<=number)
		{
			System.out.println(number);
			number/=2;
			count++;
		}
	}
	
	public static void problem3()
	{
		/*
		1 0
		4 2
		16 4
		32 5
		64 6
		 */
	}
	
	public static void problem4()
	{
		/*
		19 0
		21 1
		3 4
		5 3
		1 6
		 */
	}
	
	public static void problem5()
	{
		/*
		a	0-99
		b	50-69
		c	0-69
		d	(-20)-79
		e	0-36
		 */
	}
	
	public static void problem6()
	{
		Random rand = new Random();
		int result = rand.nextInt(10);
		System.out.println(result);
	}
	
	public static void problem7()
	{
		Random rand = new Random();
		int result = rand.nextInt((25)*2)+50;
		System.out.println(result);
	}
	
	public static void problem13()
	{
		Scanner in = new Scanner(System.in);
		int max = 0;
		int min = Integer.MAX_VALUE;
		int inputednum = 0;
		
		while (inputednum>=0)
		{
			System.out.print("Type a number (or give -1 to exit): ");
			inputednum = in.nextInt();
			if (inputednum==-1)
				break;
			if (inputednum>max)
				max = inputednum;
			if (inputednum<min)
				min = inputednum;
		}
		
		System.out.println("Maximum was " + max);
		System.out.println("Minimum was " + min);
		in.close();
	}
}
