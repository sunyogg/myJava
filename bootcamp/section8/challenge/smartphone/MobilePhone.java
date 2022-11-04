package java.bootcamp.section8.challenge.smartphone;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner input = new Scanner(System.in);

    // use this object to do everything in the mobilePhone.
    private static Contacts contact;

    private static ArrayList<String> names = new ArrayList<String>();
    private static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public MobilePhone(Contacts contact) {
        this.contact = contact;
    }

    public void storeContact() {
        // this will store the contacts in the ArrayList.
        names.add(contact.getName());
        numbers.add(contact.getNumber());



    }

    public void printFunctions() {
        System.out.println("Press: ");
        System.out.println("\t0  : Print functions");
        System.out.println("\t1 : Modify Contacts");
        System.out.println("\t2 : Remove Contacts");
        System.out.println("\t3 : Rename Contacts");
        System.out.println("\t4 : Search Contacts");
        System.out.println("\t5 : Quit Phone Book");
    }

    public void modifyContact(String name, int newNumber) {
        // This will modify the contact in the ArrayList.
        // This will update the number.
        if (names.contains(name)) {
            int nameIndex = names.indexOf(name);
            numbers.set(nameIndex,newNumber);
        } else {
            System.out.println(name + " does not exist in the directory.");
        }





    }

    public void removeContact(String name) {
        // This will delete the contact from the ArrayList.
        if (names.contains(name)) {
            int numberIndex = names.indexOf(name);
            names.remove(name);
            numbers.remove(numberIndex);
        } else {
            System.out.println("Contact " + name + " is not in the" +
                    " Contact directory.");
        }

    }

    public static void renameContact(String newName) {
        // This will rename the contact name in the ArrayList.
        String name = contact.getName();
        if (names.contains(name)) {
            int nameIndex = names.indexOf(name);
            names.set(nameIndex, newName);
        } else {
            System.out.println(name + " does not exist in the directory.");
        }
    }

    public void searchContact(String name) {
        // This will search the contact in the arrayList.
        if (names.contains(name)) {
            int indexName = names.indexOf(name);
            System.out.println(names.get(indexName) + " : " +
                    numbers.get(indexName));
        } else {
            System.out.println(name + " is not in the directory.");
        }
    }
}

// we will make sure that index of name in names and index of number in
// numbers matches, so that there is some kind of relation between
// name and number stored in 2 different array.
