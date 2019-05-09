package design.patterns.java.singleton;


public class SingletonDemo {

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        obj.sayHello();
    }
}
