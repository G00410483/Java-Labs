import java.util.Random;

public class Coin
{
	private String sideUp;

	public Coin()
	{
		Random randomNumber = new Random();
		int rand1 = randomNumber.nextInt(2);

		if (rand1 == 0)
		{
			this.sideUp = "Heads";
		}
		else
		{
			this.sideUp = "Tails";
		}
	}
	public void Toss()
	{

		Random randomNumber = new Random();
		int rand2 = randomNumber.nextInt(2);

		if (rand2 == 0)
		{
			this.sideUp = "Heads";
		}
		else
		{
			this.sideUp = "Tails";
		}
	}
	public String getSideUp()
	{
		return sideUp;
	}

}
