public class Person 
{	private Name name;
	private Address address;

	public Person(Address address)
	{
		name=new Name("Mohamad", "Ali");
		this.address=address;		
	}
	public Name getName()
	{	return name;	}

	public String toString()
	{	return '\n' + name.getFullName() + '\n'+address.getFullAddress() +'\n'; }
}
