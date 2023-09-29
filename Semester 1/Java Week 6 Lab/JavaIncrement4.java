import java.util.Scanner;

public class JavaIncrement4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int times;
		String word;

		System.out.print("What words will be output: ");
		word = keyboard.nextLine();


		System.out.print("Enter the number of times the word should be entered: ");
		times = keyboard.nextInt();

		int test = 1;
		while (test <= times)
		{
			System.out.println(word);
			test++;
		}

	}
}