package example;

public class CamelCase {

	public static void main(String[] args) {

		String str = "heLLo worLD jaVa";

		String[] split = str.split(" ");
		// heLLo
		// worLD
		// jaVa

		StringBuilder camelCase = new StringBuilder();

		for (int i = 0; i < split.length; i++) {
			String lowerCase = split[i].toLowerCase();
			// hello
			// world
			// java

			if (i == 0) {
				camelCase.append(lowerCase);
			} else {
				camelCase.append(Character.toUpperCase(lowerCase.charAt(0))).append(lowerCase.substring(1));
			}

		}
		System.out.println(camelCase);
	}

}
