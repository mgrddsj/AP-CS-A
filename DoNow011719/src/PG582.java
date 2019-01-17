
public class PG582 
{

	public static void main(String[] args) 
	{
		
	}

	public static void Q11()
	{
		//See class "BankAccount". 
	}

	public static void Q12()
	{
		//See class "BankAccount"
	}
}

class BankAccount
{
	String name;
	double balance;
	double transaction = 0.0;

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		if (balance - amount - transaction > 0)
		{
			balance = balance - amount - transaction;
		}
		else
		{
			System.out.println("You don't have enough money! ");
		}
	}

	public void changeTransactionFee(double amount)
	{
		transaction = amount;
	}

	//Q12
	public String toString()
	{
		return name + ", " + balance;
	}

	//Q13
	public void transfer(BankAccount p2,double amount)
	{
		changeTransactionFee(5.0);
		if (balance - amount - 5.0 > 0)
		{
			withdraw(amount);
			p2.deposit(amount);
		}
		else
		{
			System.out.println("You don't have enough money! ");
		}
	}
}

