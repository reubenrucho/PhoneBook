package phoneBook;

public class Address 
{
	private String Street;
	private String city;
	private String state;
	private String zipCode;
	
	public Address() {
		
	}
	
	public Address(String street, String city, String state, String zipCode) {
		this.Street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	@Override
	public String toString() {
		return "Person [city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}	
}
