package java.bootcamp.section8.challenge.bettersmartphone;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone("238429");

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0 :
                    printFunctions();
                    break;
                case 1 :
                    addNewContact();
                    break;
                case 2 :
                    updateContact();
                    break;
                case 3 :
                    printDetails();
                    break;
                case 4 :
                    printContact();
                    break;
                case 5 :
                    removeContact();
                    break;

                case 6 :
                    flag = false;
                    System.out.println("Closing PhoneBook...");
                    break;
            }
        }
    }

    private static void printFunctions() {
        System.out.println("Press:" +"\n\t0 - Print List Of Functions." +
                "\n\t1 - Add New Contact." +
                "\n\t2 - Update Existing Contact." +
                "\n\t3 - Print Details." +
                "\n\t4 - Print The List Of Contact." +
                "\n\t5 - Remove an Existing Contact." +
                "\n\t6 - Close Phone Book.");
    }

    private static void addNewContact() {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter number: ");
        String phoneNumber = input.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);
        phone.addNewContact(contact);
    }

    private static void updateContact() {
        System.out.print("Enter existing name: ");
        String oldName = input.nextLine();

        Contact oldContact = phone.queryContact(oldName);
        if (oldContact == null) {
            System.out.println("Does not exist");
        } else {
            System.out.print("Enter new name: ");
            String newName = input.nextLine();
            if (phone.queryContact(newName) != null) {
                System.out.println("Name Already Exist.");
            } else {
                System.out.print("Enter new number: ");
                String newNumber = input.nextLine();
                Contact newContact = Contact.createContact(newName, newNumber);
                phone.updateContact(oldContact, newContact);
            }
        }
    }

    public static void printDetails() {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        phone.getDetail(name);
    }

    public static void printContact() {
        phone.printContact();
    }

    public static void removeContact() {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        phone.removeContact(name);
    }


}
