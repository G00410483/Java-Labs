public class Square
{
	private int length;
	private int area;

	public void setLength(int len)
	{
		length = len;
	}
	public int getLength()
	{
		return length;
	}
	public int getArea()
	{
		area = length*length;
		return area;
	}
}
