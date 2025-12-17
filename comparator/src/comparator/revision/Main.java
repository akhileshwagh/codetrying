package comparator.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("akhilesh", 30, 14, new Address("sorav colony", 4258215));
		Employee e2 = new Employee("nishant", 38, 4, new Address("kkkc colony", 8558215));
		Employee e3 = new Employee("nehal", 24, 12, new Address("nagar colony", 6528215));
		Employee e4 = new Employee("dheeraaj", 29, 3, new Address("hans colony", 1268215));

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		System.out.println("unsorted list : " + list);
		
//		Collections.sort(list, new AgeComparator());
		Collections.sort(list, new AddressComparator());
		System.out.println("sorted list based on pincode : " + list);

		//System.out.println("sorted list : " + list);
		
//		list.sort(Comparator.comparing(Employee::getId));
//		System.out.println("sorted list based on id : " + list);
		
//		Collections.sort(list, new IdComparator());
//		System.out.println("sorted list based on id : " + list);
	}

}
