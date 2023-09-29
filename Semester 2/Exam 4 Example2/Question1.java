import java.util.Scanner;

public class Question1
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);

		System.out.print("Define array size: ");
		int size = s1.nextInt();

		int[] myArray = new int[size];

		for (int i = 0; i < myArray.length; i++)
		{
			System.out.print("Enter array value for index " + i + ": ");
			myArray[i] = s1.nextInt();
		}

		System.out.println("Array has been created. The array is as it follows: ");

		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println(myArray[i]);
		}

	}
}

