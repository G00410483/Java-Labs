import java.util.Scanner;
import java.io.*;

public class Exercise3
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("weekly.txt");
		Scanner inputFile = new Scanner(file);

		double[] myArray = new double[7];
		double sum = 0;

		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = inputFile.nextDouble();
			System.out.println("Take for the day " + (i + 1) + " was " + myArray[i]);
			sum = sum + myArray[i];
		}
		System.out.println("Total take for this week was: " + sum);
	}
}