import java.util.Scanner;
import java.io.*;

public class Exercise6
{
	public static void main(String[] args) throws IOException
	{
		int[][] myGrid = new int [2][4];

		myGrid[0][0] = 55;
		myGrid[0][1] = 56;
		myGrid[0][2] = 57;
		myGrid[0][3] = 58;
		myGrid[1][0] = 59;
		myGrid[1][1] = 60;
		myGrid[1][2] = 61;
		myGrid[1][3] = 62;

		System.out.println("___________________");
		System.out.println(myGrid[0][0] + " | " + myGrid[0][1] + " | " + myGrid[0][2] + " | " + myGrid[0][3] + " | ");
		System.out.println("-------------------");
		System.out.println(myGrid[1][0] + " | " + myGrid[1][1] + " | " + myGrid[1][2] + " | " + myGrid[1][3] + " | ");
		System.out.println("-------------------");
	}

}