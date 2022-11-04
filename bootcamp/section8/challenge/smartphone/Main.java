package java.bootcamp.section8.challenge.smartphone;

public class Main {
    public static void main(String[] args) {
        Contacts contact = new Contacts(23234, "Dan Harbour");
        MobilePhone phone = new MobilePhone(contact);

        phone.storeContact();
        phone.searchContact("Dan Harbour");
        phone.modifyContact("Dan Harbo", 23432345);
        phone.searchContact("Dan Harbour");
        phone.removeContact("Dan Harbour");
        phone.searchContact("Dan Harbour");

    }
}
