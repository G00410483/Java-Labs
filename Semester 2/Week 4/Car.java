public class Car
{
	private int yearModel;
	private String make;
	private int speed;

	public void setCar(int yearModel1, String make1, int speed1)
	{
		yearModel = yearModel1;
		make = make1;
		speed = speed1;
	}
	public int getyearModel()
	{
		return yearModel;
	}
	public String getMake()
	{
		return make;
	}
	public int getSpeed()
	{
		return speed;
	}
	public int accelerate()
	{
		int acc = 0;
		acc = speed + 5 + acc;
		return acc;
	}
}
