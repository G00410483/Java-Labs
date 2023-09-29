import java.util.Scanner;
import java.io.*;

public class Exercise4
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("rainfall.txt");
		Scanner inputFile = new Scanner(file);

		double[] myArray = new double[365];
		double sum = 0;

		double max = myArray[0];
		double min = myArray[0];

		int dayMin = 0;
		int dayMax = 0;

		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = inputFile.nextDouble();
			System.out.println("Rainfall for day " + (i + 1) + " was " + myArray[i]);
			sum = sum + myArray[i];

			if (max < myArray[i])
			{
				max = myArray[i];
				dayMax = i;
			}
			if (min > myArray[i])
			{
				min = myArray[i];
				dayMin = i;
			}
		}

		System.out.printf("Total rainfall for the year was: %.2f %n", sum);
		System.out.printf("Average daily rainfall was: %.2f %n", (sum / 365));
		System.out.printf("Average weekly rainfall was: %.2f %n", (sum / 52));
		System.out.printf("Average monthly rainfall was: %.2f %n", (sum / 12));
		System.out.println("The day with maximum rainfall was day " + (dayMax + 1) + " was " + max);
		System.out.println("The day with minimum rainfall was day " + (dayMin + 1) + " was " + min);
	}
}