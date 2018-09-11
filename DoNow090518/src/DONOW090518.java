

/*
n		n^2		n^3		n^4
1		1		1		1
2		4		8		16
3		9		27		81
4		16		64		256
5		25		125		625
 */

public class DONOW090518 
{

	public static void main(String[] args) 
	{
		System.out.println("n\t\tn^2\t\tn^3\t\tn^4");
		for (int n=1;n<=5;n++)
		{
			System.out.println(n + "\t\t" + (n*n) + "\t\t" + (n*n*n) + "\t\t" + (n*n*n*n));
		}
	}

}
