
public class Test15 {

	public static void main(String[] args) {
		System.out.println(blackjack(19,21) + " "  + blackjack(21,19) + " " + blackjack(19,22) + " " + blackjack(22,23)+ " " + blackjack(19,20));
	}

	public static int blackjack(int a,int b)
	{
	if (a>21)
	a=0;
	if (b>21)
	b=0;
	if (a>b)
	return a;
	else 
	return b;
	}
}
