import java.util.Scanner;
import java.io.*;

public class Exercise5
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("rainfall.txt");
		Scanner inputFile = new Scanner(file);

		int[][] myGrid = new int [1][3];

		myGrid[0][0] = 99;
		myGrid[0][1] = 98;
		myGrid[0][2] = 97;

		System.out.println("Value at 0, 0 is: " + myGrid[0][0]);
		System.out.println("Value at 0, 1 is: " + myGrid[0][1]);
		System.out.println("Value at 0, 2 is: " + myGrid[0][2]);
	}
}