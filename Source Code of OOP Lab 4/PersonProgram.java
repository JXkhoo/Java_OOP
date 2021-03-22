abstract class Person{
	protected String description;
	public Person(){
	};

	public abstract String toString();
}

class Student extends Person{
	String course;

	public Student(String course){
		this.course = course;
	}
	public String toString(){
		return ("a student majoring in "+course);
	}
}

class Employee extends Person{
	double salary;

	public Employee(double salary){
		this.salary=salary;
	}
	public String toString(){
		String s = Double.toString(salary);
		return ("an employee with a salary of $"+s);
	}
}

public class PersonProgram{
	public static void main(String a[]){
		Person student = new Student("computer science");
		System.out.println(student.toString());
		Person employee = new Employee(50000.00);
		System.out.println(employee.toString());
	}
}