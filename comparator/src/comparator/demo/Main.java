package comparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "akhilesh", 25, new Address("nana park", 462010));
		Employee e2 = new Employee(4, "divya", 27, new Address("indus", 462521));
		Employee e3 = new Employee(3, "yash", 22, new Address("godrej", 485325));
		Employee e4 = new Employee(2, "atharv", 30, new Address("leela", 482365));

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

		System.out.println("before sorting");
		empList.forEach(System.out::println);

		System.out.println("after sorting");

		//sorting based on employee id
	//	Collections.sort(empList,Comparator.comparingInt(Employee::getId));
	//	empList.forEach(System.out::println);
		
		////sorting based on employee id using stream
//		List<Employee> list = empList.stream().sorted(Comparator.comparingInt(Employee::getId).reversed()).toList();
//		list.forEach(System.out::println);
		
		//sorting based on employee age
//			Collections.sort(empList,  new AgeComparator());
//			for (Employee employee : empList) {
//				System.out.println("sorted based on age"+ employee);	
//			}
			
			//sorting based on employee address
//			Collections.sort(empList,  new AddressComparator());
//			for (Employee employee : empList) {
//				System.out.println("sorted based on address pincode "+ employee);	
//			}
		
		Collections.sort(empList, new AddressComparator()); // uses compareTo()

        System.out.println("\nAfter sorting by age, then id, then name:");
        empList.forEach(System.out::println);
		
	}
}
