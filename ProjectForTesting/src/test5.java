
public class test5 {

	public static void main(String[] args) {
		String s = "happy Friday";
		int n = 666;
		System.out.println(n % s.length());

		System.out.println(Math.round((double)n / s.length()));

		System.out.println((int)Math.sqrt(n));

		System.out.println((Math.floor(n/100)+s).substring(3, 5));
	}

}
