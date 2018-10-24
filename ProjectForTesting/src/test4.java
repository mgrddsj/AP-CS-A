
public class test4 {

	public static void main(String[] args) {
		reverser("abcdefg");
	}

	public static int reverser(String text) {
		String reversed = "";
		for(int i=text.length()-1;i>=0;i--)
		{
			reversed = reversed + text.charAt(i);
		}
		System.out.println(reversed);
		return text.length();
	}
}
