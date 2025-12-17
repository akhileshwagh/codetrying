package example;

public class ConstructorPrivate {
	
	int age;
	
	private ConstructorPrivate() {
		age=30;
	}
public static void main(String[] args) {
	ConstructorPrivate c = new ConstructorPrivate();
	System.out.println(c.age);
	
	
}
}
