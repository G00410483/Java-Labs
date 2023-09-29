import java.util.Scanner;
public class JavaStringCompare3
{
	public static void main (String []args)
	{
		int num1;
		int num2;
		int num3;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		num1 = keyboard.nextInt();
		System.out.print("Enter 2nd number: ");
		num2 = keyboard.nextInt();
		System.out.print("Enter 3rd number: ");
		num3 = keyboard.nextInt();



		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Biggest number is: " + num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.println("Biggest number is: " + num2);
		}
		else if (num3 > num1 && num3 > num2)
		{
			System.out.println("Biggest number is: " + num3);
		}

	}
}
