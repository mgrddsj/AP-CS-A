
public class FibonacciSequence 
{

	public static void main(String[] args) 
	{
		System.out.println("0\n1");
		printFibonacciSequence(0, 1, 0);
		printSumFibonacciSequence(0, 1, 0, 0);
		System.out.println(printSum(0, 0));
	}

	public static void printFibonacciSequence(int num1, int num2, int count)
	{
		count++;
		System.out.println(num1 + num2);
		if (count<23)
		{
			printFibonacciSequence(num2, num1 + num2, count);
		}
	}
	
	public static void printSumFibonacciSequence(int num1, int num2, int count, int sum)
	{
		count++;
		sum += (num1 + num2);
		if (count<23)
		{
			printSumFibonacciSequence(num2, num1 + num2, count, sum);
		}
		else 
		{
			System.out.println("Sum = " + sum);
		}
	}
	
	public static int printSum(int num, int sum)
	{
		if (num<25)
		{
			num++;
			sum = sum + printSum(num, sum);
		}
		sum += num;
		return sum;
	}

}
