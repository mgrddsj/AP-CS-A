import java.util.Arrays;
//pg.523

public class DoNow120318 
{

	public static void main(String[] args) 
	{
		int[] a = {27,15,15,11,27};
		System.out.println(question5_mode(a));
	}

	public static int question3_countInRange(int[] list,int min,int max)
	{
		int count = 0;
		for (int i=0;i<list.length;i++)
		{
			if (list[i]>=min && list[i]<=max)
				count++;
		}
		return count;
	}
	
	public static Boolean question4_isSorted(int[] list)
	{
		for (int i=0;i<list.length;i++)
		{
			if (i==0 && !(list[i]>=Integer.MIN_VALUE))
				return false;
			else 
				if (!(list[i] >= list[i-1]))
					return false;
		}
		return true;
	}
	
	public static int question5_mode(int[] list)
	{
		int max = 0;
		for (int i=0;i<list.length;i++)
		{
			if (list[i]>max)
				max=list[i];
		}
		
		int[] countList = new int[max+1];
		
		for (int i=0;i<list.length;i++)
		{
			countList[list[i]]++;
		}
		
		int mode = 0;
		int maxCount =0;
		for (int i=0;i<countList.length;i++)
		{
			if (countList[i]>maxCount)
			{
				maxCount=countList[i];
				mode=i;
			}
		}
		return mode;
	}
	

}
