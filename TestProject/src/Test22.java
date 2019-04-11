import java.util.ArrayList;
import java.util.Arrays;

public class Test22 
{

	public static void main(String[] args) 
	{
		String jumble = "shehas250antsinher5rooms";  
		String d = "0123456789";  
		int n1=0, n2=0;  
		        
		for (int i=0; i<jumble.length(); i++)  
		{  
		    if(d.indexOf(jumble.substring(i,i+1))>=0)  
		        n1+=Integer.parseInt(jumble.substring(i,i+1));  
		    else  
		        n2++;  
		}  
		System.out.println(n1+n2);
	}
	
	public static ArrayList<String> removeBad(ArrayList<String> phrases)  
	{  
	     for (String aPhrase : phrases)  
	     {  
	          if (aPhrase.indexOf("bad") >= 0)  
	          {  
	               phrases.remove(aPhrase);  
	          }  
	     }  
	     return phrases;  
	}
	
	public static ArrayList<Integer> setList(ArrayList<Integer> nums)
	{
	   ArrayList<Integer> outputList = new ArrayList<Integer>();
	   for (int i=0; i<nums.size(); i++)   
	   {
	       outputList.add(nums.get(i));
	       if (outputList.get(i)%10==0 && i>0) 
	           outputList.set(i-1, nums.get(i-1)*2);
	   }
	   return outputList;
	}
	
	public static void sleek(String str)
	{
		if(str.length()>2)
		{
			sleek(str.substring(2));
			System.out.print(str);
		}
		System.out.println("!");
	}
	
	public static ArrayList<String> replaceBad(ArrayList<String> phrases)  
	{  
	     int i = 0;  
	     for (String aPhrase : phrases)  
	     {  
	          if (aPhrase.indexOf("bad") >= 0)  
	          {  
	               phrases.set(i, "happy thoughts");  
	          }  
	          i++;  
	     }  
	     return phrases;  
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
