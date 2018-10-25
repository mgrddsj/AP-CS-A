
public class Test2 {

	public static void main(String[] args) {
		testMethod();
	}

	public static String sSearch(int[] x, int key)
    {
        String y = "";
        boolean z = false;
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] == key)
            {
                y += i + " ";
                z = true;
            }
        }
        if (!z)
            y = "key was not found";

        return y;
    }
    
    public static void testMethod()
    {
        int[] y = new int[12];
        for (int i = 0; i < y.length; i++)
            y[i] = 5*(i/4);

        System.out.println(sSearch(y, 5));
    }
}
