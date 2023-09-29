import java.util.Scanner;
import java.io.*;

public class Exercise9
{
	public static void main(String[] args) throws IOException
	{
		int[][] myGrid = new int[5][6];

		for (int row = 0; row < 5; row++)
		{
			for (int col = 0; col < 6; col++)
			{
				myGrid[row][col] = 50;
			}
		}
		for (int row = 0; row < 5; row++)
		{
			for (int col = 0; col < 6; col++)
			{
				System.out.print(myGrid[row][col] + " ");
			}
			System.out.println();
		}

	}
}