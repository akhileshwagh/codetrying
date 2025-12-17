package example;

class Teacher {
}

public class Singleton {

	private static Singleton var = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return var;
	}

	public void simpleMethod() {
		System.out.println("hashcode of the instance is " + var.hashCode());

	}

}
