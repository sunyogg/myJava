package myJava.bootcamp.section9.interfaces.practice;

public interface ITelephone {

    // We are creating signatures here.
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}