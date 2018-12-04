import java.util.Arrays;

//pg.523 Q8

public class DoNow120418 
{

	public static void main(String[] args) 
	{
		int[] list = {5,2,4,17,55,4,3,26,18,2,17};
		System.out.println(median(list));
	}

	public static double median(int[] list)
	{
		sort(list);
		if (list.length%2==1)
			return list[list.length/2];
		else 
			return (list[list.length/2]+list[list.length/2-1])/2.0;
	}
	
	public static void sort(int[] list)
	{
		for (int i = 0; i < list.length; i++) 
		{
		    for (int j = 0; j < list.length; j++) 
		    {
		        if (list[i] < list[j]) 
		        {
		            int temp = list[i];
		            list[i] = list[j];
		            list[j] = temp;
		        }
		    }
		}
	}
}
