import java.util.Scanner;

public class Exercise13
{
	public static void main (String[] args)
	{
		int[] number = { 2, 4, 6, 23, 67, 75, 45, 67, 78, 65, 45, 45, 43, 98, 9, 8, 9, 12 };

		int max = number[0];
		int min = number[0];

		for (int i = 0; i < number.length; i++)
		{
			if (max < number[i])
			{
				max = number[i];
			}
			if (min > number[i])
			{
				min = number[i];
			}
		}
		System.out.println("The biggest number is:" + max);
		System.out.println("The smallest number is: " + min);
	}
}