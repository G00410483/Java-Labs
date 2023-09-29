public class Question4
{
	public static void main(String[] args)
	{
		Passanger p1 = new Passanger("Lewis", "Hamilton", 1985, true, 200);
		Passanger p2 = new Passanger("Maria", "Sharapova", 1987, true, 200);
		Passanger p3 = new Passanger("George", "Foreman", 1949, false, 125);
		Passanger p4 = new Passanger("Steffi", "Graff", 1969, false, 125);
		Passanger p5 = new Passanger("David", "Beckham", 1975, true, 200);

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		System.out.println();
		System.out.println(p1.report());
	}
}