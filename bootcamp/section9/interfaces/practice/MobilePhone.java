package myJava.bootcamp.section9.interfaces.practice;



public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    boolean isPowerOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isPowerOn = false;

    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isPowerOn) {
            System.out.println("Ringing " + phoneNumber + " on Mobile phone.");
        } else {
            System.out.println("Phone is Switched off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        } else {
            System.out.println("Someone is calling you, turn on the phone.");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isPowerOn) {
            isRinging = true;
            System.out.println("Tu Tu TaDa Da...");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
