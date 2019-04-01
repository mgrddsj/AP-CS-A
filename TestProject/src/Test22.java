import java.util.Arrays;

public class Test22 
{

	public static void main(String[] args) 
	{
		 stringRecur("ssssssssssssssssssssssssssssssssssssss");
		// int[] arr1 = {0,6,0,4,0,0,2};
		// test(arr1);
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

}
