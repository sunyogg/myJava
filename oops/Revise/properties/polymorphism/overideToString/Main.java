package myJava.oops.Revise.properties.polymorphism.overideToString;

public class Main {
    public int data;

    public Main(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Main";
    }

    public static void main(String[] args) {
        Main man = new Main(3);
        System.out.println(man);
        // Internal implementation of java when we print object.
//        System.out.println(Integer.toHexString(man.hashCode()));
//        System.out.println(man.getClass().getName() + "@" + Integer.toHexString(man.hashCode()));
    }
}