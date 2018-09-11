
public class copy2 
{
	public static void main(String[] args) {
		for(int count=10;count>=1;count--) {
			for(int num=count;num>=1;num--) {
				System.out.print(num + ",");
				if (num==1) {		//if it is in the last loop of num, do the following code. 
					for(int slashes=11-count;slashes>=1;slashes--) {
						System.out.print("/");
					}
				}
			}
			System.out.println();
		}
	}
}
