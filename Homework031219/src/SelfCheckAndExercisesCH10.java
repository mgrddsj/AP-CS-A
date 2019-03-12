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

}
