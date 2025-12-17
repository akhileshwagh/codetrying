package example;

public class StaticBlock {

	static int age = 20;

	static {
		System.out.println("static 1");
	}

	public static void main(String[] args) {
		System.out.println("asdf");
		int age2 = StaticBlock.age;
		System.out.println(age2);
	}
}
