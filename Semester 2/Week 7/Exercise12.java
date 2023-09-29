import java.util.Scanner;
import java.io.*;

public class Exercise12
{
	public static void main(String[] args) throws IOException
	{
		Scanner s1 = new Scanner(System.in);

		int[][] numbers = new int[3][3];
		numbers[0][0] = 5;
		numbers[0][1] = 9;
		numbers[0][2] = 18;
		numbers[1][0] = 6;
		numbers[1][1] = 22;
		numbers[1][2] = 14;
		numbers[2][0] = 6;
		numbers[2][1] = 4;
		numbers[2][2] = 7;



		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				System.out.print(numbers[row][col] + "   ");
			}
			System.out.println("\n\n");
		}
		System.out.print("Add all the values from column? (Enter 0, 1, 2):");
		int choice = s1.nextInt();

		int sum = 0;

		for(int i = 0; i < 3;i++)
		{
			sum = sum + numbers[i][choice];
		}

		System.out.println(sum);

	}
}