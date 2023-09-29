import java.util.Scanner;
import java.io.*;

public class Exercise13
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("people.txt");
		Scanner inputFile = new Scanner(file);

		String[] name = new String[1];
		int[] idNum = new int[1];
		double[] total = new double[1];

		int i = 0;

		while(inputFile.hasNext())
		{
			name[i] = inputFile.next();
			idNum[i] = inputFile.nextInt();
			total[i] = inputFile.nextDouble();
			i++;

		}
		for (int x = 0; x < name.length; x++)
		{
			System.out.println(name[i]);
			System.out.println(idNum[i]);
			System.out.println(total[i]);
			break;
		}
	}
}