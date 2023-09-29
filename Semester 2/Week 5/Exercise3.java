public class Exercise3
{
	public static void main (String[] args)
	{
		Employee e1 = new Employee("Donald", 52);
		Employee e2 = new Employee("Amanda", 32);

		System.out.println(e1.getName() + " is " + e1.getAge());
		System.out.println(e2.getName() + " is " + e2.getAge());
	}
}