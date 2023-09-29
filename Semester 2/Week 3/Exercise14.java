import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Exercise14
{
	public static void main(String[] args)throws IOException
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("Input the string: ");
		String text = s1.nextLine();
		int num = numVo(text);
		System.out.println(num);

	}
	public static int numVo(String text)
	{
		int numV = 0;
		for (int i = 1; i <= 100; i++)
		{
			if (text.charAt(i) == 'a')
			{
				numV++;
				return numV;
			}
		}

	}
}