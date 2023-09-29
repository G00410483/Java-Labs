import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Exercise8
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int compNum;
		int guess;

		compNum = computerRandom();
		guess = userGuess();
		checkGuess(compNum, guess);

	}
	public static int computerRandom()
	{
		Random randomNumber = new Random();
		int rand;
		rand = randomNumber.nextInt(10) + 1;
		return rand;
	}
	public static int userGuess()
	{
		String num1;
		num1 = JOptionPane.showInputDialog("Guess a number between 1 and 10: ");
		int number = Integer.parseInt(num1);
		return number;
	}
	public static void checkGuess(int compNum, int guess)
	{
		if (compNum == guess)
		{
			JOptionPane.showMessageDialog(null, "You guessed correctly!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, better luck next time!");
		}
	}
}