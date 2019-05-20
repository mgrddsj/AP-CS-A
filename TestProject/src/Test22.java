import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test22 
{

	public static void main(String[] args) 
	{
		int[] abc = new int[5];
		for (int i=1; i<=5; i++)
		{
		    abc[i] = i;
		}
		

		
		
		
	}
	public static double averageGolfTeamScores(int[][] golfScores)
	{
	    double sum = 0;
	    for (int i=0; i<golfScores.length; i++)
	    {
	        for (int j=0; j<golfScores[i].length; j++)
	        {
	            sum+=golfScores[j][i];
	        }
	    }
	    int count = golfScores.length*golfScores[0].length;
	    return sum/count;
	}
	
	public static double calcAverageAge(int[] ages)  
	{  
	     int sum = 0;  
	     for (int i=0; i<ages.length; i++)  
	     {  
	         sum+=i;  
	     }  
	     return sum/ages.length;  
	}
	
	public static int crush(int x)
	{
		System.out.println("a");
	    if(x < 1)
	        return 1;
	    else
	        return x + crush(x-1);
	}
	
	public static int calcSum(int start, int increment, int end)
    {
         int sum=start;
         int count=0;
         while(sum<end)
         {
             sum+=increment;
             if  (sum%2==0)
             {
                 sum+=1;
                 count++;
             }
         }
         System.out.println(count);
         return sum;
    }
	
	public static int countString(String str, String search)
	{
	    int count = 0;

	    for (int i=0; i<str.length(); i++)
	    {
	        if (str.indexOf(search)>=0)
	             count++;
	    }
	    return count;
	}
	

	
	public static int[] getTensDigit (int[] nums)
	{
	    int[] tensDigit = new int[nums.length];
	    for (int i=0; i<nums.length; i++)
	    {
	        if (nums[i]>-10 && nums[i]<10 )
	        {
	            nums[i]=-1;
	            tensDigit[i]=-1;
	        }
	    }
	    for (int i=0; i<nums.length; i++)
	    {
	        if (nums[i]>0 )
	            tensDigit[i] = nums[i]%100/10;
	    }
	    return tensDigit;
	}
	
	public static void sorter( double[] nums )
	{
	    for(int i=0; i< nums.length-1; i++)
	    {
	        int curr = i;
	        for(int j = i+1; j< nums.length; j++)
	        {
	            if(nums[j] < nums[curr])
	                curr = j;
	        }
	        if( curr != i)
	        {
	            double tempNum = nums[curr];
	            nums[curr] = nums[i];
	            nums[i] = tempNum;
	        }
	        System.out.println("a");
	    }
	}
	
	public static void printPrimitivesAndString(int a, double b, boolean c, String d)
	{
		a=a*100;
		b=b+100;
		c=!c;
		d=d+d;    
		System.out.println("method: " + a + ", " + b + ", " + c + ", " + d);
	}
	
	public static String sortStringA(String s)
	{
	    ArrayList<String> letters = new ArrayList<String>();
	    for (int i=0; i<s.length(); i++)
	    {
	        letters.add(s.substring(i,i+1));
	    }
	    Collections.sort(letters);
	    String newString="";
	    for (String e : letters)
	    {
	        newString = newString + e;
	    }
	    return newString;
	}
	public static String  sortStringB (String s)
	{
	    ArrayList<String> letters = new ArrayList<String>();
	    for (int i=0; i<s.length(); i++)
	    {    
	        letters.add(s.substring(i,i+1));
	    }
	    Collections.sort(letters);
	    String newString="";
	    for (String e : letters)
	    { 
	        newString = e + newString;
	    }
	    return newString;
	}
	public static String sortStringC(String s)
	{
	    ArrayList<String> letters = new ArrayList<String>();
	    for (int i=0; i<s.length(); i++)
	    {
	        letters.add(s.substring(i,i+1));
	    }
	    Collections.sort(letters);
	    String newString="";
	    for (int i=letters.size()-1; i>=0; i--)
	    {
	        newString+=letters.get(i);
	    }
	    return newString;
	}
	
	public static String backwardString(String str)    
    {
         String back = "";
    
         for (int i=str.length()-1; i>=0; i--)
         {
             back += str.substring(i,i+1);
         }
         return back;
    }
	
	   public static String sSearch(int[] x, int key)
	    {
	        String y = "";
	        boolean z = false;
	        for (int i = 0; i < x.length; i++)
	        {
	            if (x[i] == key)
	            {
	                y += i + " ";
	                z = true;
	            }
	        }
	        if (!z)
	            y = "key was not found";

	        return y;
	    }
	    
	    public static void testMethod()
	    {
	        int[] y = new int[12];
	        for (int i = 0; i < y.length; i++)
	            y[i] = 5*(i/4);

	        System.out.println(sSearch(y, 5));
	    }

}

	class Book
	{

	}

	class AudioBook extends Book
	{
		public void pagesPerMinute()
		{

		}
	}
