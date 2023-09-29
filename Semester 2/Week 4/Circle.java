public class Circle
{
	private double radius;
	private double PI;

	public void setRadius(double radius1, double PI1)
	{
		radius = radius1;
		PI = PI1;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return radius * radius * PI;
	}
	public double getDiameter()
	{
		return radius * 2;
	}
	public double getCircumference()
	{
		return 2 * PI * radius;
	}
}
