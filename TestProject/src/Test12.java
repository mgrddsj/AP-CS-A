

public class Test12 
{

	public static void main(String[] args) 
	{
		String s1="Sorry", s2="sorry", s3="shelves";  
		boolean a1 = s1.compareTo(s2)==0;  
		boolean a2 = !(s1.compareTo(s3)<0);  
		boolean a3 = !(s1.substring(2,3).equals(s2.substring(3,4)));  
		boolean a4 = !(s2.length()<s3.indexOf("e"));  
		boolean a5 = s1.length()-2==s3.substring(2).indexOf("v"); 
		System.out.println(a1 + "" + a2 + a3 + a4 + a5);
	}

}
