package example;

public class StringRotation {

	public static boolean isRotation(String s1, String s2) {

		if (s1 == null || s2 == null || s1.length() != s2.length()) { // check
			return false;
		}

		// combine the string
		String combine = s1 + s1; // abcdabcd

		return combine.contains(s2);

	}

	public static boolean isReversal(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}

		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {

			rev = rev + s1.charAt(i);
			
		}
		System.out.println(rev);
		return rev.equals(s2);

	}

	public static void main(String[] args) {
		System.out.println(isRotation("abcd", "cdab"));
		System.out.println(isReversal("abcd", "dcba"));

	}

}
