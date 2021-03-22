import java.util.*;
public class TestAssociate2
{
	public static void main(String args[])
	{
		Course1 cs1 = new Course1("OOP","SCP3103",3);
		Course1 cs2 = new Course1("TP1","SCJ1013",2);
		Course1 cs3 = new Course1("TP2","SCJ1213",1);
		Course1 cs4 = new Course1("KP","SCP2113",6);
		Course1 cs5 = new Course1("Operating System","SCP1578",3);
		Course1 cs6 = new Course1("Data Structure","SCP1216",4);

		Student1 s1 = new Student1("ALI","AC0021","2SCK");
		Student1 s2 = new Student1("ABU","AC0022","3SCK");
		Student1 s3 = new Student1("BEN","AC0023","3SCS");
		Student1 s4 = new Student1("KhooJX","AC0024","2SCP");

		cs1.addStudent(s1);
		cs1.addStudent(s2);
		cs1.addStudent(s3);
		cs2.addStudent(s2);
		cs3.addStudent(s2);
		cs5.addStudent(s4);
		cs6.addStudent(s4);

		cs1.printAllInfo();
		cs2.printAllInfo();
		cs3.printAllInfo();
		cs5.printAllInfo();
		cs6.printAllInfo();

		s1.printAllInfo();
		s2.printAllInfo();
		s3.printAllInfo();
		s4.printAllInfo();
	}
}