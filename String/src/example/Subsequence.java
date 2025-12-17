package example;

public class Subsequence {

	public static boolean isSubsequence(String s1, String s2) {

		int i = 0;
		int j = 0;

		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++; // move pointer in s1
			}
			j++; // move pointer in s2
		}

		return i == s1.length();
	}
	
	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "aebdc"));
		System.out.println(isSubsequence("abc", "acdb"));

	}

}
