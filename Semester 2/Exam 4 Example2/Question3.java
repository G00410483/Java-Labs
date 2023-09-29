import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Question3
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("temp.txt");
		Scanner inputFile = new Scanner(file);

		int[] temp = new int[366];

		int i = 0;
		int sum = 0;

		do
		{
			temp[i] = inputFile.nextInt();
			i++;

		}	while (inputFile.hasNext());

		int min = temp[0];
		int max = temp[0];

		int dayMin = 0;
		int dayMax = 0;

		for (int x = 0; x < temp.length; x++)
		{
			if (min > temp[x])
			{
				min = temp[x];
				dayMin = x;
			}
			else if (max < temp[x])
			{
				max = temp[x];
				dayMax = x;
			}
		}
		for (int x = 0; x < temp.length; x++)
		{
			sum += temp[x];
		}

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;

		for (int x = 0; x <= 91; x++)
		{
			sum1 += temp[x];
		}
		for (int x = 92; x <= 182; x++)
		{
			sum2 += temp[x];
		}
		for (int x = 183; x <= 273; x++)
		{
			sum3 += temp[x];
		}
		for (int x = 274; x <= 365; x++)
		{
			sum4 += temp[x];
		}

		System.out.println("Average daily temperature was: " + (sum / temp.length));
		System.out.println("Average temperature for Q1 was " + (sum1 / 91));
		System.out.println("Average temperature for Q2 was " + (sum2 / 91));
		System.out.println("Average temperature for Q3 was " + (sum3 / 91));
		System.out.println("Average temperature for Q4 was " + (sum4 / 92));
		System.out.println("The day with the highest temperature was day " + (dayMax + 1) + " and it was " + max + " degrees celsius that day.");
		System.out.println("The day with the lowest temperature was day " + (dayMin + 1) + " and it was " + min + " degrees celsius that day.");


	}
}

