import java.util.ArrayList;
import java.util.Collection;

public class SelfCheckAndExercisesCH10 
{

	public static void main(String[] args)
	{
		// ArrayList<String> strings = new ArrayList<>();
		// strings.add("It");
		// strings.add("was");
		// strings.add("a");
		// strings.add("stormy");
		// strings.add("night");
		// strings.add(3, "dark");
		// strings.add(4, "and");
		// strings.set(1, "IS");
		// System.out.println(strings);
		// q6(strings);
		// System.out.println(strings.toString());
	}
	
	public static void q1()
	{
		/*
		 * An ArrayList is an object that stores objects. Its length can be changed through adding and removing objects. 
		 * We should use ArrayList when we don't know how much data we need to store. 
		 */
	}

	public static void q2()
	{
		// e
	}

	public static void q3()
	{
		ArrayList<String> strings = new ArrayList<>();
		strings.add("It");
		strings.add("was");
		strings.add("a");
		strings.add("stormy");
		strings.add("night");
		// Size: 5
		// Type: String
	}

	public static void q4(ArrayList<String> strings)
	{
		strings.add(3, "dark");
		strings.add(4, "and");
	}

	public static void q5(ArrayList<String> strings)
	{
		strings.set(1, "IS");
	}

	public static void q6(ArrayList<String> strings)
	{
		for (int i=0; i<strings.size(); i++)
		{
			while (strings.get(i).contains("a"))
			{
				strings.remove(i);
			}
		}
	}

	public static void q7()
	{
		ArrayList<Integer> integers = new ArrayList<>();
		for (int i=0; i<=10; i++)
		{
			integers.add(i*2);
		}
	}

	public static int q8(ArrayList<String> strings)
	{
		if (strings.isEmpty())
		{
			return 0;
		}

		int length = 0;
		for (int i=0; i<strings.size(); i++)
		{
			if (length < strings.get(i).length())
			{
				length = strings.get(i).length();
			}
		}
		return length;
	}

	public static void q9(ArrayList<String> strings)
	{
		System.out.println(strings.contains("IS"));
	}

	public static void q10(ArrayList<String> strings)
	{
		System.out.println(strings.indexOf("stormy"));
		System.out.println(strings.indexOf("dark"));
	}

	public static void q11(ArrayList<String> strings)
	{
		for(String s: strings)
		{
			System.out.println(s.toUpperCase());
		}
	}

	public static void q12()
	{
		//Because the length of the ArrayList changes. 
	}

	public static void q13()
	{
		//Because int is a primitive data type. 
		//Change <int> to <Integet> will fix the problem. 
	}

	public static void q14()
	{
		//Wrapper classes are classes that provides a way to use primitive data types as objects.
		//int is a primitive data type, Integer is the wrapper class of it. 
		//int cannot be used as a data type for ArrayList, Integer can. 
	}

	public static void q15()
	{
		/*
		 * a. [1, 2, 6, 8]
		 * b. [10, 20, 30, 40, 50, 60]
		 * c. [-4, 1, 4, 9, 16, 25, 36, 49, 64]
		 */
	}

	public static void q16()
	{
		/*
		 * a. [20, 10, 20, 30, 30, 20]
		 * b. [8, 7, 8, 2, 9, 7, 4, 4, 8, 8]
		 * c. [33, 28, 33, -1, 3, 28, 17, 9, 33, 17, -1, 33]
		 */
	}

	public static void q17()
	{
		/*
		 * a. [72, 20]
		 * b. [1, 20, 18, 15, 11, 6]
		 * c. [10, 90, 70, 40]
		 */
	}

	public static void q18()
	{
		/*
		 * a. [30, 20, 10]
		 * b. [4, 7, 9, 2, 8]
		 * c. [33, 9, 17, 28, 3, -1]
		 */
	}

	public static ArrayList<String> swapPairs(ArrayList<String> strings)
	{
		for (int i=0; i<strings.size()/2; i++)
		{
			String temp = strings.get(i*2+1);
			strings.set(i*2+1, strings.get(i*2));
			strings.set(i*2, temp);
		}
		return strings;
	}

	public static ArrayList<String> removeEvenLength(ArrayList<String> strings)
	{
		for (int i=0; i<strings.size(); i++)
		{
			while (strings.get(i).length() %2 == 0)
			{
			       strings.remove(i);
			}
		}
		return strings;
	}
	
	

}
