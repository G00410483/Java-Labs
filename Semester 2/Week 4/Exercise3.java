public class Exercise3
{
	public static void main (String[] args)
	{
		Phone phone1 = new Phone();
		phone1.setPhone("Apple Iphone", 599.99, 11);

		Phone phone2 = new Phone();
		phone2.setPhone("Samsung s20", 549.45, 4);

		Phone phone3 = new Phone();
		phone3.setPhone("Nokia 5310", 95.00, 6);

		System.out.println(phone1.getName() + " " + phone1.getPrice());
		System.out.println(phone2.getName() + " " + phone2.getPrice());
		System.out.println(phone3.getName() + " " + phone3.getPrice());

	}
}
