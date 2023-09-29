//David Vlasic, 26.04.2022.
//Lab Exam 4, Question 4
import java.util.Scanner;
import java.io.*;

public class DavidVlasicQuestion4
{
	public static void main(String[] args)
	{
		//Creating objects
		Technology t1 = new Technology("Dell", "Optiplex", 'C', 599.99);
		Technology t2 = new Technology("Apple", "Iphone", 'P', 999.99);
		Technology t3 = new Technology("Dell", "Optiplex", 'C', 299.99);
		Technology t4 = new Technology("Samsung", "S20", 'P', 299.99);
		Technology t5 = new Technology("Samsung", "A10", 'P', 199.99);
		Technology t6 = new Technology("Bose", "ZA1", 'S', 299.99);
		Technology t7 = new Technology("Nokia", "3310", 'P', 50.00);
		Technology t8 = new Technology("HP", "Deskpro", 'C', 799.99);
		Technology t9 = new Technology("Lenovo", "ThinkPad", 'C', 799.99);
		Technology t10 = new Technology("SanDisk", "USB Pen Drive", 'O', 9.99);

		//Output of toString method
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		System.out.println(t5.toString());
		System.out.println(t6.toString());
		System.out.println(t7.toString());
		System.out.println(t8.toString());
		System.out.println(t9.toString());
		System.out.println(t10.toString());

		System.out.println("-------------------------");
		System.out.println(t1.report());
		System.out.println("-------------------------");
	}
}


