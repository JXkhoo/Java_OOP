import java.util.*;
public class TestAssociate
{
	public static void main(String args[])
	{
		Course cs1 = new Course("OOP","SCP3103",3);
		Course cs2 = new Course("TP1","SCJ1013",2);
		Course cs3 = new Course("TP2","SCJ1213",1);
		Course cs4 = new Course("KP","SCP2113",6);
		Course cs5 = new Course("Operating System","SCP1578",3);
		Course cs6 = new Course("Data Structure","SCP1216",4);

		Student s1 = new Student("ALI","AC1234","2SCS");
		s1.registerCourse(cs1);
		s1.registerCourse(cs2);
		s1.printAllInfo();
		System.out.println();

		Student s2 = new Student("AHMAD","AC1122","3SCK");
		s2.registerCourse(cs1);
		s2.registerCourse(cs3);
		s2.registerCourse(cs4);
		s2.printAllInfo();

	}
}