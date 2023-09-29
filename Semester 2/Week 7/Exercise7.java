import java.util.Scanner;
import java.io.*;

public class Exercise7
{
	public static void main(String[] args) throws IOException
	{
		int[][] myGrid = new int [3][6];

		myGrid[0][0] = 10;
		myGrid[0][1] = 11;
		myGrid[0][2] = 12;
		myGrid[0][3] = 13;
		myGrid[0][4] = 14;
		myGrid[0][5] = 15;
		myGrid[1][0] = 16;
		myGrid[1][1] = 17;
		myGrid[1][2] = 18;
		myGrid[1][3] = 19;
		myGrid[1][4] = 20;
		myGrid[1][5] = 21;
		myGrid[2][0] = 22;
		myGrid[2][1] = 23;
		myGrid[2][2] = 24;
		myGrid[2][3] = 25;
		myGrid[2][4] = 26;
		myGrid[2][5] = 27;

		System.out.println("____________________________");
		System.out.println(myGrid[0][0] + " | " + myGrid[0][1] + " | " + myGrid[0][2] + " | " + myGrid[0][3] + " | " + myGrid[0][4] + " | " + myGrid[0][5]);
		System.out.println(myGrid[1][0] + " | " + myGrid[1][1] + " | " + myGrid[1][2] + " | " + myGrid[1][3] + " | " + myGrid[1][4] + " | " + myGrid[1][5]);
		System.out.println(myGrid[2][0] + " | " + myGrid[2][1] + " | " + myGrid[2][2] + " | " + myGrid[2][3] + " | " + myGrid[2][4] + " | " + myGrid[2][5]);
		System.out.println("\n\n");

		myGrid[0][2] = 99;
		myGrid[1][3] = 50;
		myGrid[2][0] = 77;

		System.out.println(myGrid[0][0] + " | " + myGrid[0][1] + " | " + myGrid[0][2] + " | " + myGrid[0][3] + " | " + myGrid[0][4] + " | " + myGrid[0][5]);
		System.out.println(myGrid[1][0] + " | " + myGrid[1][1] + " | " + myGrid[1][2] + " | " + myGrid[1][3] + " | " + myGrid[1][4] + " | " + myGrid[1][5]);
		System.out.println(myGrid[2][0] + " | " + myGrid[2][1] + " | " + myGrid[2][2] + " | " + myGrid[2][3] + " | " + myGrid[2][4] + " | " + myGrid[2][5]);

	}

}