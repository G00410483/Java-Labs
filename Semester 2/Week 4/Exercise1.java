public class Exercise1
{
	public static void main (String[] args)
	{
		Square box1 = new Square();
		box1.setLength(10);

		Square shape1 = new Square();
		shape1.setLength(55);

		Square alpha = new Square();
		alpha.setLength(512);

		System.out.println("Testing the Length Getter Method");
		System.out.println("Box 1 :" + box1.getLength());
		System.out.println("Shape 1: " + shape1.getLength());
		System.out.println("Alpha: " + alpha.getLength());
		System.out.println("Testing the Area Getter Method");
		System.out.println("Box 1: " + box1.getArea());
		System.out.println("Shape 1: " + shape1.getArea());
		System.out.println("Alpha: " + alpha.getArea());
	}
}
