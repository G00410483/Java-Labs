//ThomasMitchell G00400162 05/04/2022
import java.util.*;
public class ThomasMitchellLabExam4Q1
{
	public static void main(String[] args)
	{
		int userNumSize, userNumValue;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Define array size: ");
		userNumSize = keyboard.nextInt();

		int[] userArray = new int[userNumSize];

		for(int i = 0; i < userNumSize; i++)
		{
			System.out.print("Enter array value for index "+i+": ");
			userNumValue = keyboard.nextInt();

			userArray[i] = userNumValue;
		}

		System.out.println("Array has been created. The array is as follows:");

		for(int i = 0; i < userNumSize; i++)
		{
			System.out.println(userArray[i]);
		}
	}
}