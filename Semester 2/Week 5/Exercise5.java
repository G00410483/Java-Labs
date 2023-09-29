public class Exercise5
{
	public static void main (String[] args)
	{
		Student s1 = new Student("Bob");
		Student s2 = new Student ("Jason", "Smith");
		Student s3 = new Student();

		System.out.println(s1.getName());
		System.out.println(s1.getSurname());
		System.out.println(s1.getAge());

		System.out.println(s2.getName());
		System.out.println(s2.getSurname());
		System.out.println(s2.getAge());

		System.out.println(s3.getName());
		System.out.println(s3.getSurname());
		System.out.println(s3.getAge());


	}
}