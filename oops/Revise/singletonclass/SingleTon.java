package myJava.oops.Revise.singletonclass;

public class SingleTon {

    private SingleTon() {

    }
    private static SingleTon instance;


    public static SingleTon getInstance() {
        // if no instance is created, allow them to create an instance.
        if (instance == null) {
            instance = new SingleTon();
            return instance;
        // if instance has been created, return the same instance, so that we are
        // not creating another instance.
        } else {
            return instance;
        }
    }
}