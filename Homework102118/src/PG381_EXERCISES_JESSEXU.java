import java.util.Random;
import java.util.Scanner;

public class PG381_EXERCISES_JESSEXU 
{

	public static void main(String[] args) 
	{
		Q1_showTwos(120);
		Q4_randomLines();
		Q7_diceSum();
		Q11_threeHeads();
		System.out.println(Q13_consecutive(3,2,4));
		System.out.println(Q13_consecutive(1,2,2));
	}

	public static void Q1_showTwos(int num)
	{
		System.out.print(num + " = ");
		while (num%2==0)
		{
			System.out.print(2 + " * ");
			num/=2;
		}
		System.out.println(num);
	}
	
	public static void Q4_randomLines()
	{
		Random rand = new Random();
		int count = 0;
		while (count!=16)
		{
			count = rand.nextInt(16)+5;
			for (int i=1;i<=count;i++)
				System.out.print("x");
			System.out.println();
		}
	}
	
	public static void Q7_diceSum()
	{
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		int sum = 0;
		System.out.print("Desired dice sum: ");
		int key = in.nextInt();
		while (sum!=key)
		{
			int num1 = rand.nextInt(6)+1;
			int num2 = rand.nextInt(6)+1;
			sum = num1 + num2;
			System.out.println(num1 + " and " + num2 + " = " + sum);
		}
		in.close();
	}
	
	public static void Q11_threeHeads()
	{
		Random rand = new Random();
		int row = 0;
		while (row!=3)
		{
			if (rand.nextBoolean())
			{
				System.out.print("H ");
				row++;
			}
			else 
			{
				System.out.print("T ");
				row = 0;
			}
		}
		System.out.println("\nThree heads in a row! ");
	}
	
	public static boolean Q13_consecutive(int a,int b,int c)
	{
		if ((a+b+c)/3.0==a || (a+b+c)/3.0==b || (a+b+c)/3.0==c)
			if (a+1==b||a+1==c||b+1==a||b+1==c||c+1==a||c+1==b)
				return true;
			else 
				return false;
		else return false;
	}
}
