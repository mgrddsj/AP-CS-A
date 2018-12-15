/*
 * ACSL Intermediate Division - 2018-2019 - Contest #1 Digit Reassembly
 * Usage: Please place a file named "input.txt" with input in the project folder of the program. 
 * 				Each input should be separated in lines. Output will be in the console. 
 * 
 * @Author: Jesse Xu
 * @Date: 2018/12/15
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ACSL_2018To2019_Intermediate_Jesse 
{

	public static void main(String[] args) throws IOException 
	{
		File inputFile = new File("input.txt"); //Create file object. 
		FileReader reader = new FileReader(inputFile); //Create a reader for the file object. 
		BufferedReader readFile = new BufferedReader(reader); //Create buffered reader to read data in the file. 
		
		String input = readFile.readLine(); //Read a line. 
		while (input != null) //Read input line by line. Run the method for each line of input. 
		{
			System.out.println(digitRessembly(input)); //Run the method for this line. 
			input = readFile.readLine(); //Read next line. 
		}
		readFile.close();
	}

	public static long digitRessembly(String input)
	{
		String[] splitedData = input.split(" "); //Separate the input. 
		String largeNum = splitedData[0]; //Put the large number into a standalone string. 
		int digits = Integer.parseInt(splitedData[1]); //Put the number of digits into an integer. 
		long sum = 0; //Use long in case that the number is too large. 

		for (int i=0;i<=largeNum.length()-digits;i++)
		{
			sum += Long.parseLong(largeNum.substring(i,i+digits)); //Add up the sum. 
		}
		return sum;
	}
}
