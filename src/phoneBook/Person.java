package phoneBook;

public class Person extends Address
{
	private String firstName;
	private String lastName;
	private Address address;
	private String cell;

	public Person() {}
	
	public Person(String firstName, String lastName, Address address, String cell) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cell = cell;
	}

	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getCell() 
	{
		return cell;
	}
	public void setCell(String cell) 
	{
		this.cell = cell;
	}



	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", cell=" + cell
				+ "]";
	}

	
}
