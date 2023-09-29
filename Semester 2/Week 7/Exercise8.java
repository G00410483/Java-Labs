import java.util.Scanner;
import java.io.*;

public class Exercise8
{
	public static void main(String[] args) throws IOException
	{
		int[][] myGrid = new int [2][5];


		for (int row = 0; row <= 1; row++)
		{
			for (int col = 0; col <= 4; col++)
			{
				myGrid[row][col] = 99;
			}
		}
		for (int row = 0; row <= 1; row++)
		{
			for (int col = 0; col <= 4; col++)
			{
				System.out.print(myGrid[row][col] + " ");
			}
			System.out.println();
		}
	}
}