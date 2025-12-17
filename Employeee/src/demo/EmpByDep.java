package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

	String name;
	int age;
	String department;
	String gender;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", gender=" + gender + "]";
	}

	public Employee(String name, int age, String department, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
		this.gender = gender;
	}

	public String getName() {
		return name;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}

public class EmpByDep {
	
	public static void main(String[] args) {
		
		List<Employee> employees= Arrays.asList(
				new Employee("akhilesh", 25, "HR", "male"),
				new Employee("sakshi", 21, "HR", "female"),
				new Employee("ankita", 25, "finance", "female"),
				new Employee("naresh", 28, "finance", "male"),
				new Employee("nikhil", 26, "HR", "male"),
				new Employee("divya", 22, "finance", "female"),
				new Employee("aman", 32, "finance", "male"),
				new Employee("aditi", 35, "HR", "female"));
		
		Map<String,Map<String,List<Employee>>> collect = employees
				.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getGender)));
	
	System.out.println(collect);
	
	}

}
