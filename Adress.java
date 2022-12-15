
public class Adress {
	protected String street;
	protected String state;
	protected String city;
	protected String zipCode;
	
	public Adress(String street, String state, String city, String zipCode) {
		this.street=street;
		this.state=state;
		this.city=city;
		this.zipCode=zipCode;
	}
 
	@Override
	public String toString() {
		return "Adress [street=" + street + ", state=" + state + ", city=" + city + ", zipCode=" + zipCode + "]";
	}

	public String getStreet() {
		return street;
	}
	
	public String getState(){
		return state;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setStreet(String street) {
		this.street=street;
	}
	
	public void setState(String state) {
		this.state=state;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode=zipCode;
	}
}
