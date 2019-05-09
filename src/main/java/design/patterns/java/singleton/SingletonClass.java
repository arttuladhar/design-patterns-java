package design.patterns.java.singleton;

public class SingletonClass {
	
	private static SingletonClass instance;
	private SingletonClass(){};
	
	public static SingletonClass getInstance(){
		
		if (null != instance) {
			return instance;
		} else {
			return new SingletonClass();
		}
	}
	
	public void sayHello(){
		System.out.println("Hello World");
	}
}
