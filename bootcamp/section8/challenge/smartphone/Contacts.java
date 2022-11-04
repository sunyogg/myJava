package java.bootcamp.section8.challenge.smartphone;

public class Contacts {
    private int number;
    private String name;

    public Contacts(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public static Contacts createContact(int phoneNumber, String name) {
        return new Contacts(phoneNumber, name);
    }



}
