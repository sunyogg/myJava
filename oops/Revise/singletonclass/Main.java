package myJava.oops.Revise.singletonclass;

public class Main {

    public static void main(String[] args) {
        SingleTon one = SingleTon.getInstance();
        System.out.println(one);
        SingleTon two = SingleTon.getInstance();
        System.out.println(one);
        SingleTon three = SingleTon.getInstance();
        System.out.println(one);
    }

}