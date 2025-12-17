package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FilterDigit {

	public static void main(String[] args) {

		List<String> num = Arrays.asList("er", "we4r", "yf", "u8t", "1", "4rtf5");

		List<String> filterNumbers = num.stream().filter(s -> s.matches(".*\\d.*")).collect(Collectors.toList());
          List<String> filterNumbers1 = num.stream().filter(s->s.chars().anyMatch(Character::isDigit)).collect(Collectors.toList());
		System.out.println(filterNumbers);
		System.out.println(filterNumbers1);

		String rev = "";
		
		 String s = "akaka";
		for(int i =s.length()-1; i>=0; i--) {
			 rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(s)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
		

//		char[] charArray = s.toCharArray();
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.print(charArray[i]);
//		}

//		StringBuffer s1 = new StringBuffer(s);
//		StringBuffer reverse = s1.reverse();
//		System.out.println(reverse);
	}

}
