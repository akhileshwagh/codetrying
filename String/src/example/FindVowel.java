package example;

import java.util.ArrayList;
import java.util.List;

public class FindVowel {
	public static void main(String[] args) {
		String input = "akhilesh";

		int vowel = 0;
		int consonants = 0;

		List<Character> vowelList = new ArrayList<>();
		List<Character> consonantsList = new ArrayList<>();

		for (char ch : input.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if ("aeiou".indexOf(ch) != -1) {
					vowel++;
					vowelList.add(ch);
				} else {
					consonants++;
					consonantsList.add(ch);
				}
			}

		}

		System.out.println("total vowels are " + vowel);
		System.out.println("total consonants are " + consonants);
		System.out.println("vowels are " + vowelList);
		System.out.println("consonants are " + consonantsList);

	}

}
