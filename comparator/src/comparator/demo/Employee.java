package comparator.demo;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private Integer age;

	public Employee(Integer id, String name, Integer age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// ✅ Comparable logic
	@Override
	public int compareTo(Employee o) {
		// 1️⃣ First compare by name
		int nameCompare = this.name.compareTo(o.name);
		if (nameCompare != 0) {
			return nameCompare;
		}

		// 2️⃣ If names are equal, compare by id
		int idCompare = this.id.compareTo(o.id);
		if (idCompare != 0) {
			return idCompare;
		}

		// 3️⃣ If both name and id are equal, compare by age
		return this.age.compareTo(o.age);
	}

}
