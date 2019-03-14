import java.util.*;

public class client 
{

	public static void main(String[] args) 
	{
		Human someone = new Boy();
		someone.walk();

		List<String> strings = new ArrayList<>();
		strings.add("Something");
		
		Collection<Integer> ints = new ArrayList<>();
		ints.add(1);
	}

}

class Boy implements Human
{
	public void walk()
	{
		System.out.println("Walking... ");
	}

	public void talk()
	{
		System.out.println("BlahBlahBlah... ");
	}
}
