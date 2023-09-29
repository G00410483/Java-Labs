import java.util.Scanner;
import java.io.*;

public class Exercise14
{
	public static void main(String[] args) throws IOException
	{
		Scanner s1 = new Scanner(System.in);
		File file = new File("banking.txt");
		Scanner inputFile = new Scanner(file);

		String[] names = new String[5];
		int[] accNum = new int[5];
		double[] current = new double[5];

		System.out.print("Select user: ");
		int choice = s1.nextInt();

		int i = 0;

		while(inputFile.hasNext())
		{
			names[i] = inputFile.next();
			accNum[i] = inputFile.nextInt();
			current[i] = inputFile.nextDouble();
			i++;
		}
		System.out.println("---------");
		System.out.println(names[choice]);
		System.out.println(accNum[choice]);
		System.out.println(current[choice]);
	}
}