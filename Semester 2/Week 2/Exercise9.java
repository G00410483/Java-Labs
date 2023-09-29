import java.util.Scanner;

public class Exercise9
{
	public static void main(String[] args)
	{
		 Scanner keyboard = new Scanner(System.in);
		 char letter;

		System.out.print("Chose A S D or M: ");
		letter = keyboard.next().charAt(0);

		if (letter == 'a' || letter == 'A')
		{
			calculate(5, 4, 'A');
		}
		else if (letter == 's' || letter == 'S')
		{
			calculate(5, 4, 'S');
		}
		else if (letter == 'd' || letter == 'D')
		{
			calculate(5, 4, 'D');
		}
		else if (letter == 'm' || letter == 'M')
		{
			calculate(5, 4, 'M');
		}
	}
	public static void calculate(double num1, double num2, char letter)
	{
		if (letter == 'a' || letter == 'A')
		{
			System.out.println("Number 1: " + num1);
			System.out.println("Number 2: " + num2);
			System.out.println("Operator: " + letter);
			System.out.println("Result: " + (num1 + num2));
		}
		else if (letter == 's' || letter == 'S')
		{
			System.out.println("Number 1: " + num1);
			System.out.println("Number 2: " + num2);
			System.out.println("Operator: " + letter);
			System.out.println("Result: " + (num1 + num2));
		}
		else if (letter == 'm' || letter == 'M')
		{
			System.out.println("Number 1: " + num1);
			System.out.println("Number 2: " + num2);
			System.out.println("Operator: " + letter);
			System.out.println("Result: " + (num1 + num2));
		}
		else if (letter == 'd' || letter == 'D')
		{
			System.out.println("Number 1: " + num1);
			System.out.println("Number 2: " + num2);
			System.out.println("Operator: " + letter);
			System.out.println("Result: " + (num1 + num2));
		}


	}
}