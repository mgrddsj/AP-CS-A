
public class PracticePG524Q13 
{

	public static void main(String[] args) 
	{
		int[] list = {3,8,10,1,9,14,-3,0,14,207,56,98,12};
		System.out.println(longestSortedSequence(list));
	}

	public static int longestSortedSequence(int[] list)
	{
		int maxLength = 0;
		int sequence = 1;
		int temp = list[0];

		if (list.length == 0)
			return 0;

		for (int i=1;i<list.length;i++)
		{
			if (list[i]>temp)
			{
				temp = list[i];
				sequence++;
				if (sequence>maxLength)
					maxLength = sequence;
			}
			else 
			{
				temp = list[i];
				sequence = 1;
			}
		}
		return maxLength;
	}
}
