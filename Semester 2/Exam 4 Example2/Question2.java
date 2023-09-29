import java.util.Scanner;

public class Question2
{
	public static void main(String[] args)
	{
		int[][] myCounter = new int[2][5];

		System.out.println("------------------------------------");

		for (int row = 0; row < 2; row++)
		{
			for (int col = 0; col < 5; col++)
			{
				myCounter[row][col] = 2000 + col;
				System.out.print(myCounter[row][col] + "\t");
			}
			System.out.println("");
		}
		System.out.println("------------------------------------");

	}
}

