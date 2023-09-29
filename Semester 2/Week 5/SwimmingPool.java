public class SwimmingPool
{
	private double length;
	private double width;
	private double depth;

	public SwimmingPool(double length, double width, double depth)
	{
		this.length = length;
		this.width = width;
		this.depth = depth;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public void setDepth(double depth)
	{
		this.depth = depth;
	}
	public double getCapacity()
	{
		double capacity = length * width * depth * 1000;
		return capacity;
	}
}