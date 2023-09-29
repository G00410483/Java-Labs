public class Car
{
	private String make;
	private String model;
	private double size;
	private int year;
	private String colour;

	public Car()
	{
		year = 2022;
	}
	public Car(String make, String model, String colour)
	{
		this.make = make;
		this.model = model;;
		this.colour = colour;
	}
	public Car(String make, String model, double size, int year, String colour)
	{
		this.make = make;
		this.model = model;
		this.size = size;
		this.year = year;
		this.colour = colour;
	}
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public double getSize()
	{
		return size;
	}
	public int getYear()
	{
		return year;
	}
	public String getColour()
	{
		return colour;
	}

}