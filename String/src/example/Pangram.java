package example;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static boolean isPangram(String input) {

		String input1 = input.toLowerCase();
		Set<Character> set = new HashSet<>();

		for (char c : input1.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				set.add(c);
			}
		}
		return set.size() == 26;

	}

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPangram(input));

	}

}
