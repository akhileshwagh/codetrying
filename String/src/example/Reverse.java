package example;

public class Reverse {
	public static void main(String[] args) {

		String str = "java is love";

		String[] split = str.split(" ");

		String rev = "";
		for (String s : split) {
			String temp ="";
			//System.out.println(s);

			for (int i = s.length() - 1; i >= 0; i--) {
				temp = temp + s.charAt(i);
			}
			rev= rev + temp+" ";
		}
		
		System.out.println(rev.trim());
		
		
	}
}
