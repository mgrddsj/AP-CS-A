import java.util.ArrayList;
import java.util.Arrays;

public class Test22 
{

	public static void main(String[] args) 
	{
//		 stringRecur("ssssssssssssssssssssssssssssssssssssss");
		// int[] arr1 = {0,6,0,4,0,0,2};
		// test(arr1);
//		System.out.println(nested(1, 2));
//		kooky(1);
//		StringMania mania = new StringMania("kilometer");
//		System.out.print(mania.stringGymnastics(10) + " ");
//		System.out.print(mania.stringGymnastics("me", 3) + " ");
//		System.out.println(mania.stringGymnastics(5,8));
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(400);
		nums.add(300);
		nums.add(200);
		System.out.println(processNums(nums));
	}

	public static void stringRecur(String s)
	{
		if (s.length() < 15)
			System.out.println(s);
		stringRecur(s + "*");
	}

	public static void test(int[] arr1)
	{
		int count = 0;
		for (int i=0; i< arr1.length; i++)
		{
			if (arr1[i] != 0)
			{
				arr1[count] = arr1[i];
				count++;
			}
		}
		int[] arr2 = new int[count];
		for (int i=0; i<count; i++)
		{
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));
	}

	public static void test2(int[] arr)
	{
		int sum=arr[0], i=0;
		while (i<arr.length)
		{
			i++;
			sum += arr[i];
		}
	}
	
	public static int nested(int x, int y)
	{
	    int q = 0;
	 
	    if (x == 1) 
	    {
	        q++;
	        if (y == 2)
	            q++;
	        y++;
	    }
	    q++;
	    if (y == 3) 
	    {
	        q++;
	        if (y == 2) 
	        {
	            q++;
	            q++;
	        }
	    }
	    q++;
	    return q;
	}
	
	public static int kooky(int a)  
	{  
		System.out.println("I'm being called");
		if (a>10)  
			return 2;  
		else  
			if (a<5)  
				return 5+kooky(a+2);  
		return a+kooky(a+1);  
	}
	
	public static int processNums(ArrayList<Integer> nums)
	{
	    int a = 0;
	    for (int i=0; i<nums.size(); i++)
	    {
	        a += nums.get((int) (Math.random()*nums.size()));
	    }
	    return a;
	}

}

class StringMania 
{
	private String str;

	public StringMania(String s)
	{
		str = s;
	}

	public int stringGymnastics(String s1, int a)
	{
		if (str.indexOf(s1)>=0)
			if (a>str.indexOf(s1))
				return a;
			else
				return str.indexOf(s1);
		else
			return a*-1;
	}

	public String stringGymnastics(int a)
	{
		if (a<str.length())
			return str.substring(a);
		else
			if (str.length()>0)
				return str.substring(str.length()-1);
			else
				return null;
	}

	public String stringGymnastics(int a, int b)
	{
		if (a>0 && a<b && b<=str.length())
			return str.substring(a,b);
		else
			if (str.length()>0 && a>=0 && a<str.length())
				return str.substring(a);
			else
				return "no";
	}
}
