
public class client 
{

	public static void main(String[] args) 
	{
		TestObj testObj = new TestObj();
		
		Student s1 = new Student(3.5);
		Student s2 = new Student(3.5);

		System.out.println(s1.equals(s2));
		
	}

}
