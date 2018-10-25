
public class Test3 {

	public static void main(String[] args) {
		for(int i=5;i>=0;i--)
		{
		String alphabet = "ABCDEF";
		System.out.print(alphabet.substring(0,(i+1)));

		for(int num=i;num>0;num--)
		{
		System.out.print(num);
		}

		System.out.println();
		}
	}

}
