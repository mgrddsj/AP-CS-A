
public class AccountClient 
{

	public static void main(String[] args) 
	{ 
		Account Jesse = new Account("Jesse",100000000);
		System.out.println(Jesse.check());
		Jesse.deposit(999999);
		System.out.println(Jesse.check());
		System.out.println(Jesse.getOwner());
	}

}
