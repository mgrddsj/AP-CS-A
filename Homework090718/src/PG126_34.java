//Name: Jesse Xu
//Last changed: 09.09.2018
//Description: Problem 34 on pg.126. 

//The program below is the original program on the book with errors commented
public class PG126_34 {
	public static final int MAX_ODD = 21;
	
	public static void writeOdds() {
		for (int count = 1; count <= (MAX_ODD		2); count++) { //The 2 after MAX_ODD is probably a typo
			System.out.print(count + " ");
			count = count +2;
		}
		System.out.print(count + 2); //The variable count is not defined. It is only defined in the for loop. 
	}
	
	public static void main(String[] args) {
		writeOdds();
		MAX_ODD = 11; //MAX_ODD is not a constant, which cannot be changed. 
		//Need System.out.println(); here to skip a line. 
		writeOdds();
		
	}

}
