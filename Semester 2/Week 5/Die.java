import java.util.Random;

public class Die
{
	private int sides = 6;
	private int value;

	public Die()
	{
		this.sides = 6;
	}
	public void roll()
	{
		Random randomNumber = new Random();
		value = randomNumber.nextInt(12) + 1;
	}
	public int getValue()
	{
		return value;
	}
}
