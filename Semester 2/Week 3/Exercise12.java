import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Exercise12
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("Farenheit\t\t\tCelsuius");
		for (int i = 60; i <= 80; i++)
		{
			String myVar = celsius(i);
			System.out.println(myVar);
		}
	}
	public static String celsius(int i)
	{
		double temp = 0.55555 * (i - 32);
		return i + "\t\t\t\t" + temp;
	}
}
