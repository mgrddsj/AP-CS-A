import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class client 
{

	public static void main(String[] args) 
	{
		Student[] students = new Student[5];
		Random rand = new Random();
		for (int i=0; i<5; i++)
		{
			students[i] = new Student(rand.nextDouble());
		}

		ArrayList<String> strings = new ArrayList<String>();
		strings.add("e");
		strings.add(0, "a");
		strings.get(0);
		System.out.println(strings.contains("a"));
		strings.clear();
		strings.add("111");
		strings.indexOf("111");
		System.out.println(strings.isEmpty());
		strings.lastIndexOf("111");
		strings.remove(0);
		strings.remove("111");
		strings.add("e");
		strings.set(0, "2222");
		System.out.println(strings.size());
		System.out.println(Arrays.toString(strings.toArray()));
	}

}
