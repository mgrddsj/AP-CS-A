


//The program below is the original program on the book with errors commented
public class PG126_34 {
	public static final int MAX_ODD = 21;
	
	public static void writeOdds() {
		for (int count = 1; count <= (MAX_ODD	2); count++) { //The 2 after MAX_ODD is probably a typo
			System.out.println(count + " ");
			count = count +2;
		}
		System.out.print(count + 2); //The variable count is not defined. It is only defined in the for loop. 
	}
	
	public static void main(String[] args) {
		
	}

}
