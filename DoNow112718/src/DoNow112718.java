import java.util.Arrays;

public class DoNow112718 
{

	public static void main(String[] args) 
	{
		int[] list = {1,2,3,4,5,6,7,8,9};
		reverser(list);
		System.out.println(Arrays.toString(list));
		shifter(list,2);

	}

	public static void reverser(int[] list)
	{
		for (int i=0;i<list.length/2;i++)
		{
			int temp = list[i];
			list[i] = list[list.length-1-i];
			list[list.length-1-i] = temp;
		}
	}
	
	public static void shifter(int[] list,int shift)
	{
		int[] newList = new int[list.length];
		for (int i=0;i<list.length;i++)
		{
			if (i-shift < 0)
			{
				newList[i] = list[list.length-1-i];
			}
			else 
			{
				newList[i] = list[i-shift];
			}
		}
		System.out.println(Arrays.toString(newList));
		
		
		/*
		int[] temp = new int[shift];
		for (int i=0;i<=shift;i++)
		{
			temp[i] = list[list.length-i];
		}
		
		for (int i=0;i<list.length;i++)
		{
			list[i-shift]=list[i];
		}
		*/
	}
}
