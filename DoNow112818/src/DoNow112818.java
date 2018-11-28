
public class DoNow112818 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		System.out.println(search(a,22));
	}

	public static boolean search(int[] list,int num)
	{
		boolean returnValue = false;
		for (int i=0;i<list.length;i++)
		{
			if (list[i]==num)
				returnValue = true;
		}
		return returnValue;
	}
	
	public static void replacer1(int[] list,int num,int replaceWith)
	{
		if (search(list,num))
		{
			for (int i=0;i<list.length;i++)
			{
				if (list[i] == num)
					list[i] = replaceWith;
			}
		}
		else
		{
			System.out.println("Value not found! ");
		}
	}
	
	public static void replacer2(int[] list,int num,int replaceWith)
	{
		if (search(list,num))
		{
			int i = 0;
			while (i<list.length)
			{
				if (list[i] == num)
					list[i] = replaceWith;
				i++;
			}
		}
		else
		{
			System.out.println("Value not found! ");
		}
	}
}
