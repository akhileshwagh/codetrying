package comparator.revision;

public class Employee {

	private String name;
	private int age;
	private Integer id;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + ", address=" + address + "]";
	}

	private Address address;

	public String getName() {
		return name;
	}

	public Employee(String name, int age, Integer id, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
