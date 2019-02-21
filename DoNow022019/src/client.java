
public class client {

	public static void main(String[] args) 
	{
		BasisStudent bigzStu = new BasisStudent();
		BusStudent busStu = new BusStudent();
		DormStudent dormStu = new DormStudent();

		System.out.println(bigzStu.getLifeStatus());
		System.out.println(bigzStu.getHomework());
		System.out.println(bigzStu.getHappy());
		System.out.println();

		System.out.println(busStu.getLifeStatus());
		System.out.println(busStu.getHomework());
		System.out.println(busStu.getHappy());
		System.out.println(busStu.getLocationAt9PM());
		System.out.println();

		System.out.println(dormStu.getLifeStatus());
		System.out.println(dormStu.getHomework());
		System.out.println(dormStu.getHappy());
		System.out.println(dormStu.getLocationAt9PM());
		System.out.println();
	}

}
