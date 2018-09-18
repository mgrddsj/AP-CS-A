
public class QUIZCORRECTION 
{

	public static void main(String[] args) 
	{
		for(int i=5;i<=8;i++)
		{
			if(i==5)
			{
				for(int specialCase=1;specialCase<=4;specialCase++)
				{
					System.out.print("A");
				}
			}
			else
			{
				for(int letterA=1;letterA<=i;letterA++)
				{
					System.out.print("A");
				}
			}

			for(int num=i;num>=1;num--)
			{
				System.out.print(num);
			}

			System.out.println();
		}
	}

}
