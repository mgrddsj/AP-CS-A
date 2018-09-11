
public class copy 
{
	public static void main(String[] args) {
		for(int count=10;count>=1;count--) {
			for(int num=count;num>=1;num--) {
				if (num==1) {
					System.out.print(num);
					for(int slashes=11-count;slashes>=1;slashes--) {
						System.out.print("/");
					}
				}
				else {
					System.out.print(num + ",");
				}
			}
			System.out.println();
		}
	}
}
