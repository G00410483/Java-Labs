import java.util.Scanner;
import java.io.*;

public class Exercise1
{
	public static void main (String[] args) throws IOException
	{
		File file = new File("numbers.txt");
		Scanner inputFile = new Scanner(file);

		int[] nums = new int[5];

		for (int i = 0; i < nums.length; i++)
		{

			nums[i] = inputFile.nextInt();
		}

		inputFile.close();

		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}
}