package myJava.bootcamp.section8.challenge.bettersmartphone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> phoneBook;

    public MobilePhone(String myNumber) {
        this.myNumber  = myNumber;
        this.phoneBook = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exist.");
            return false;
        } else {
            this.phoneBook.add(contact);
            return true;
        }
    }


    public void printContact() {
        System.out.println("Contact List");
        for (int i=0; i<phoneBook.size(); i++) {
            System.out.println(i+1 + ". " + phoneBook.get(i).getName() +
                    " -> " +  phoneBook.get(i).getPhoneNumber());
        }
    }



    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0 ) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else {
            int index  = findContact(oldContact);
            phoneBook.set(index, newContact);
            return true;
        }
    }

    private int findContact(Contact contact) {
            return this.phoneBook.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i=0; i<this.phoneBook.size(); i++) {
            Contact contact = this.phoneBook.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        } else {
            return null;
        }
    }

    public void getDetail(String name) {
        int index = findContact(name);
            if (index >= 0) {
                String phoneNumber = phoneBook.get(index).getPhoneNumber();
                String name1 = phoneBook.get(index).getName();
                System.out.println("\tName : " + name1 +
                        "\n\tPhone Number: " + phoneNumber);
            }
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return phoneBook.get(index);
        } else {
            return null;
        }
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0 ) {
            this.phoneBook.remove(contact);
            System.out.println("Contact was deleted");
            return true;
        } else {
            System.out.println("Not found");
            return false;
        }
    }

    public void removeContact(String name)  {
        int index = findContact(name);
        if (index >= 0) {
            phoneBook.remove(index);
            System.out.println("Contact Removed");
        } else {
            System.out.println("Contact does not  exist");
        }
    }

}
