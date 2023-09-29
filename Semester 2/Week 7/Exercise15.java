import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class Exercise15
{
	public static void main (String[] args) throws IOException
	{
		File file = new File("numbers.txt");
		Scanner inputFile = new Scanner(file);

		int[] numbers = new int[40];
		int i = 0;

		while(inputFile.hasNext())
		{
			numbers[i] = inputFile.nextInt();
			i++;
		}
		int min = numbers[0];
		int max = numbers[0];
		int minNum = 0;
		int maxNum= 0;

		for (int x = 0; x < numbers.length; x++)
		{
			if (min > numbers[x])
			{
				min = numbers[x];
				minNum = x;
			}
		}
		for (int y = 0; y < numbers.length; y++)
		{
			if (max < numbers[y]);
			{
				max = numbers[y];
				maxNum = y;

			}
		}

		System.out.println("Minimum value: " + min + " at index " + minNum);
		System.out.println("Maximum value: " + max + " at index " + maxNum);
		System.out.println("Difference: " + (max - min));

	}
}