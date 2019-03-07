
public class Ch9SelfCheck 
{

	public static void main(String[] args) 
	{
		
	}

	public static void q22()
	{
		// Interface contains only abstract methods, one need to overwrite the methods inside to make it work. 
		// Extending a class inherits all the methods in it. one can use them if they are not private. 
	}

	public static void q23()
	{
		// All the abstract fields must have been overwrited for the code to compile successfully. 
	}

	public static void q24()
	{
		// Color color should not be private. 
		// The method getColor() is not abstract, which is not allowed in a interface. 
		// Line "return method" should be deleted so that it is a valid interface. 
	}

	public static void q25()
	{
		// See classes below. 
	}

	public static void q26()
	{
		// See below. 
	}

	public static void q27()
	{
		/*
		 * Abstract classes contains abstract methods. 
		 * It can do everything a class can do. The difference is that it can contain abstact methods. 
		 */
	}

	public static void q28()
	{
		/*
		 * Behavior arrange() will be overwrited in the subclass. 
		 */
	}

	public static void q29()
	{
		/*
		 * Design a parent class (can be an abstract class if necessary) which stores all the common informations. 
		 * Create subclasses for Dramas, comedies, and documentaries. 
		 * Write abtract methods to manage the methods that need to be different on every class. 
		 */
	}

}

//Question 25
// Point method on the book. 
class Point
{
	int x;
	int y;

	public double distanceFromOrigin()
	{
		return Math.sqrt(x*x + y*y);
	}

	public void translate(int dx, int dy)
	{
		x += dx;
		y += dy;
	}
}

class Color
{
	//Stores color. 
}

interface Colored
{
	Color color = new Color();
	public Color getColor();
}

class ColoredPoint extends Point implements Colored
{
	public Color getColor()
	{
		return color;
	}
}

//Question 26
interface Shape
{
	public int getSideCount();
}

class Circle implements Shape
{
	public int getSideCount()
	{
		return 0;
	}
}

class Triangle implements Shape
{
	public int getSideCount()
	{
		return 3;
	}
}

class Rectangle implements Shape
{
	public int getSideCount()
	{
		return 4;
	}
}