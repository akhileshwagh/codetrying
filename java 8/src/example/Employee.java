package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

	String name;
	int id;
	String department;
	int age;

	@Override
	public String toString() {
		return "EmployeeByDepartment [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Employee(String name, int id, String department, int age) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public class EmployeeByDepartment {

		public static void main(String[] args) {

			List<Employee> employee = Arrays.asList(new Employee("akhilesh", 2, "HR", 30),
					new Employee("mahesh", 4, "finance", 26), new Employee("ankur", 9, "HR", 28),
					new Employee("sonali", 8, "finance", 25));

			Map<String, Map<Integer, List<Employee>>> group = employee.stream()
					.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getAge)));

			System.out.println(group);
		}

	}

}
