import java.util.Scanner;
import java.io.*;

public class Exercise11
{
	public static void main(String[] args) throws IOException
	{
		Scanner s1 = new Scanner(System.in);

		String[][] person = new String[3][3];


		for (int i = 1; i < 4; i++)
		{
			System.out.print("Enter first name for person " + i + ":");
			person[i -1][0] = s1.nextLine();

			System.out.print("Enter second name for person " + i + ":");
			person[i - 1][1] = s1.nextLine();

			System.out.print("Enter phone number of person " + i + ":");
			person[i - 1][2] = s1.nextLine();

		}
		for (int i = 1; i < 4; i++)
		{
			System.out.println("Person " + i + ": " + person[i - 1][0] + " " + person[i - 1][1] + "- " + person[i -1][2]);
		}


	}
}