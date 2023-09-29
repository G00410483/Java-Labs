import java.util.Scanner;
public class JavaIfElse6
{
	public static void main (String []args)
	{
		int num1;
		int num2;
		char operator;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter a number 2: ");
		num2 = keyboard.nextInt();
		System.out.print("Enter operator (a, s, d, m): ");
		operator = keyboard.next().charAt(0);


		if(operator == 'a')
		{
			System.out.println(num1 + " plus " + num2 + " is: " + (num1+num2));
		}

		else if (operator == 's')
		{
			System.out.println(num1 + " minus " + num2 + " is: " + (num1-num2));
		}
		else if (operator == 'd')
		{
			System.out.println(num1 + " divide " + num2 + " is: " + (num1/num2));
		}
		else if (operator == 'm')
		{
			System.out.println(num1 + " multiply " + num2 + " is: " + (num1*num2));
		}
		else
		{
			System.out.println("That is not valid number");
		}
	}
}
