package myJava.bootcamp.section9.interfaces.practice;

public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(0761);
        myPhone = new MobilePhone(2874428);

    }
}
