


/*
a.
	1. 
		i:0
		i:1
		i:2
		i:3
		i:4
		i:5
		i:6
		i:7
		i:8
		i:9
		i:10
		i:11
		i:12
		i:13
	2.
		105		  printing numbers100
		55		 printing numbers50
		30		 printing numbers25
		17			 printing numbers12
	3.
		25
		49
		81
	4.
		100
		55
		32
		21
		15
		12
		11
*/

package doNow090418;

public class DONOW090418 
{

	public static void main(String[] args) 
	{
		for (int beer= 10;beer > 0;)
		{
			System.out.println(beer + " bottles of beer on the wall, " + beer + " bottles of beer. ");
			beer -= 1;
			System.out.println("Take one down, pass it around, " + beer + " bottles of beer on the wall. ");
		}
	}

}
