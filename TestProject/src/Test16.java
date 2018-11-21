
public class Test16 {

	public static void main(String[] args) {
		int[] a = {11,12,13,14,5,4,3}; 

		for (int i = 1; i < a.length-2 ; i++) { 

		        a[i] = a[i + 1] + 2 - a [i + 1]+5 +i*2 + i%3; 

		        a[i+1] = a[i] + 2 - a [i + 1]+5 +i*2 + i%3; 
		}
		
		System.out.println("");
	}

	
}
