package comparator.demo;

public class Address implements Comparable<Address> {

	private String streetName;

	private Integer pincode;

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + "]";
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	// based on StreetName
	@Override
	public int compareTo(Address o) {
		return this.getStreetName().compareTo(o.getStreetName());
	}

//based on pincode
//	@Override
//	public int compareTo(Address o) {
//		return this.getPincode() - o.getPincode();
//	}

	public Address(String streetName, Integer pincode) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
	}

}
