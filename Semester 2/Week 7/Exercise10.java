import java.util.Scanner;
import java.io.*;

public class Exercise10
{
	public static void main(String[] args) throws IOException
	{
		int[][] myGrid = new int[6][8];

		int i = 1;

		for (int row = 0; row < 6; row++)
		{
			for (int col = 0; col < 8; col++)
			{
				myGrid[row][col] = i++;
			}
		}
		for (int row = 0; row < 6; row++)
		{
			for (int col = 0; col < 8; col++)
			{
				System.out.print(myGrid[row][col] + " ");
			}
			System.out.println();
		}

	}
}