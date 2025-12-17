package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveEmptyStringFromArray {

	public static void main(String[] args) {

		String[] input = { "akhilesh", "", "wagh", " ",null, "neha" };
		
		List<String> list = new ArrayList<>();
		
		for(String s : input) {
			if(s!=null && !s.isBlank()) {  //remove null,empty,blank
				list.add(s);
			}
		}
		String[] filteredArray = list.toArray(new String[0]);
		 System.out.println(Arrays.toString(filteredArray));
		
		

//		String[] array = Arrays.stream(input)
//				.filter(Objects::nonNull)
//				.filter(s->!s.isBlank())
//				.toArray(String[]::new);
//
//		System.out.println(Arrays.toString(array));

	}

}
