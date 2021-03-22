public class TestPerson {
  public static void main(String args[]){
    Address add1 = new Address("Jalan Pulai 13/2", 
		"Skudai", "Johor", "81310");
    Person per1 = new Person(add1);
    System.out.println(per1);
  }
}
