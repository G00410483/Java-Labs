import javax.swing.JOptionPane;
import java.util.Random;

public class Exercise8
{
	public static void main(String[] args)
	{
		int correctGuess = 0;

		for (int i = 1; i <= 5; i++)
		{

			String finalColour = userChoice();
			String finalRandom = computerChoice();

			if (finalRandom.equalsIgnoreCase(finalColour))
			{
				correctGuess++;
			}
		}
		JOptionPane.showMessageDialog(null, "Number of correct guesses is: " + correctGuess);
	}

	public static String userChoice()
	{
		String colourChoice;
		colourChoice = JOptionPane.showInputDialog("I am think of a clour.\nIs it red, green, blue, orange or yellow?");
		return colourChoice;
	}
	public static String computerChoice()
	{
		Random randomNumber = new Random();

		String colour = "";
		int rand;
		rand = randomNumber.nextInt(4);

		switch (rand)
		{
			case 0:
				colour = "red";
				break;
			case 1:
				colour = "green";
				break;
			case 2:
				colour = "blue";
				break;
			case 3:
				colour = "orange";
				break;
			case 4:
				colour = "yellow";
				break;
		}
		JOptionPane.showMessageDialog(null, colour);
		return colour;


	}
}