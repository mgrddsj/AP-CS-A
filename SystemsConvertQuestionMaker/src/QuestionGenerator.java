import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class QuestionGenerator 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		System.out.println("From what system? ");
		int initialSystem = in.nextInt();
		System.out.println("To what system? (Random from 1-20 if input -1) ");
		int destSystem = in.nextInt();
		System.out.println("How many digits? ");
		int digits = in.nextInt();
		System.out.println("How many questions? ");
		int qCount = in.nextInt();
		
	}

	public static void process(int initSys,int destSys,int digits,int qCount) throws FileNotFoundException
	{
		PrintStream questions = new PrintStream(new File("Questions.txt"));
		PrintStream answers = new PrintStream(new File("Answers.txt"));
		Random rand = new Random();
		
		if (destSys==-1)
			destSys=rand.nextInt(20)+1;
		for (int i=1;i<=qCount;i++)
		{
			String initNum = random(initSys,digits);
			String resultNum = results(initSys,destSys,initNum);
			questions.println("Convert:\tbase"+initSys+" "+random(initSys,digits)+"\tto\tbase"+destSys+": ");
		}
	}
	
	public static String random(int sys,int digits)
	{
		String num = "";
		Random rand = new Random();
		for (int i=1;i<=digits;i++)
		{
			int randNum = rand.nextInt(sys-1);
			if (randNum<=9)
				num += randNum;
			else 
			{
				switch (randNum)
				{
				case 10: 
					num += "a";
					break;
				case 11: 
					num += "b";
					break;
				case 12: 
					num += "c";
					break;
				case 13: 
					num += "d";
					break;
				case 14: 
					num += "e";
					break;
				case 15: 
					num += "f";
					break;
				case 16:
					num += "g";
					break;
				case 17: 
					num += "h";
					break; 
				case 18: 
					num += "i";
					break;
				case 19:
					num += "k";
					break;
				case 20: 
					num += "l";
					break;
				case 21: 
					num += "m";
					break;
				case 22:
					num += "n";
					break;
				case 23: 
					num += "o";
					break;
				case 24: 
					num += "p";
					break;
				case 25:
					num += "q";
					break;
				case 26:
					num += "r";
					break;
				case 27: 
					num += "s";
					break;
				case 28: 
					num += "t";
					break;
				case 29:
					num += "u";
					break;
				case 30:
					num += "v";
					break;
				case 31:
					num += "w";
					break;
				case 32: 
					num += "x";
					break;
				case 33:
					num += "y";
					break;
				case 34:
					num += "z";
					break;
				default: 
					num += "error";
					break;
				}
			}
		}
		return num;
	}
	
	public static String results(int initSys,int destSys,String num)
	{
		return Integer.toString(Integer.parseInt(num, initSys), destSys);
	}
}
