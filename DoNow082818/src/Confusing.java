
public class Confusing 
{

	public static void main(String[] args) 
	{
		method1();
		method3();
		method2();
		method3();
	}

	public static void method1()
	{
		System.out.println("1");
	}
	
	public static void method2()
	{
		method1();
		System.out.println("2");
	}
	
	public static void method3()
	{
		method1();
		method2();
		System.out.println("3");
	}
	
}
