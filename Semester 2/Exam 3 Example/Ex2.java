import java.util.Scanner;
import java.io.*;

public class Ex2
{
	public static void main (String[] args) throws IOException
	{
		calculate(6, 2, 'm');
		calculate(6, 2, 'a');
		calculate(6, 2, 'x');
	}
	public static void calculate(int num1, int num2, char option)
	{
		if (option == 'a' || option == 'A')
		{
			System.out.println(num1 + " plus " + num2 + " is: " + (num1+num2));
		}
		else if (option == 'm' || option == 'M')
		{
			System.out.println(num1 + " multiplied by " + num2 + " is: " + (num1*num2));
		}
		else
		{
			System.out.println("This is not a valid operator!");
		}
	}
}

