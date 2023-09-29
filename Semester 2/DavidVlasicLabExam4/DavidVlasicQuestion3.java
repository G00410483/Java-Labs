//David Vlasic, 26.04.2022.
//Lab Exam 4, Question 3
import java.util.Scanner;
import java.io.*;

public class DavidVlasicQuestion3
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);

		int[][] myArray = new int[3][3];

		int startNumber = 58;

		for (int row = 0; row < 3; row++)//Loop for display of array and element incremation
		{
			for (int col = 0; col < 3; col++)
			{
				myArray[row][col] = startNumber + col;
				System.out.print(myArray[row][col] + "\t-\t");
			}
			startNumber = startNumber + 3;
			System.out.println("");
			System.out.println("");
		}
		System.out.println("Ammend single element!");

		System.out.print("Specify row: (Enter 0, 1, 2): ");//User specifies row
		int num1 = s1.nextInt();
		System.out.print("Specify column: (Enter 0, 1, 2): ");//User specifies column
		int num2 = s1.nextInt();
		System.out.print("Enter new value for row " + num1 + " and column " + num2 + ": ");// User input new value
		int newValue = s1.nextInt();

		myArray[num1][num2] = newValue;
		System.out.println("");

		for (int row = 0; row < 3; row++)//Loop which will display array with new value
		{
			for (int col = 0; col < 3; col++)
			{
				System.out.print(myArray[row][col] + "\t-\t");
			}
			System.out.println("");
			System.out.println("");
		}

	}
}


