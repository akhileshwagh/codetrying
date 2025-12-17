package example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingleton {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException
	, IllegalAccessException, IllegalArgumentException, InvocationTargetException{

		// to show only a single object is created
		Singleton original = Singleton.getInstance();
		original.simpleMethod();

		Singleton duplicate = Singleton.getInstance();
		duplicate.simpleMethod();

		Teacher tech = new Teacher();
		System.out.println(tech.hashCode());

		Teacher tech1 = new Teacher();
		System.out.println(tech1.hashCode());
		
		//reflection
		
		Class<?> singletonclass = Class.forName("example.Singleton");
		Constructor<Singleton> constructor =(Constructor<Singleton>) singletonclass.getDeclaredConstructor(); 
		constructor.setAccessible(true);
		Singleton reflectionInstance = constructor.newInstance();
		
		System.out.println("object through reflection "+ reflectionInstance.hashCode());
		
		
		//breaking through serialization
		System.out.println("========================================");

		System.out.println("===========breaking through serialization===========");
		

	}
	

}
