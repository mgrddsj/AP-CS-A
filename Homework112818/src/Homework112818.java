import java.util.Arrays;

//Self-check problems chapter 7
//Jesse Xu
public class Homework112818 
{

	public static void main(String[] args) 
	{
		problem6();
	}

	public static void problem4(int min,int max)
	{
		int arrLength; 
		if (min%2==1 && max%2==1)
			arrLength = (max-min)/2-1;
		else
			arrLength = (max-min)/2;
		if (min%2==1)
			min++;
		int[] list = new int[arrLength];
		for (int i=0;i<arrLength;i++)
		{
			list[i] = min+=i*2;
		}
	}
	
	public static void problem5()
	{
		//[0, 4, 11, 0, 44, 0, 0, 2]
	}
	
	public static void problem6()
	{
		//[3, 3, 0, 0, 6, 9, 0, -18]
	}
	
	public static void problem10()
	{
		
	}
}
