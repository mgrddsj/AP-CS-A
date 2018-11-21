
public class DoNow112018 
{

	public static void main(String[] args) 
	{
		
	}

	public static void question1()
	{
		int[] list = new int[10];
		for (int i=0;i<10;i++)
			if (i%2==0)
				list[i] = i;
			else 
				list[i] = 5;
	}
	
	public static void question2()
	{
		boolean[] list = new boolean[10];
		for (int i=0;i<10;i++)
		{
			if (i==0||(10-i)<=3)
				list[i] = true;
			else
				list[i] = false;
		}
	}
	

}
