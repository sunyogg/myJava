package java.bootcamp.section8.linkedlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer("Sunyog", 40.2332);
//        System.out.println("Balance for " + customer.getName() +
//                " initialized is " + customer.getBalance());
//        Customer anotherCustomer;
//        anotherCustomer = customer;
//        anotherCustomer.setBalance(69.69);
//        // see how we used another reference to change the attribute of an
//        // object, since multiple references can point towards a single object.
//        // we can use any of these references to modify that object.
//        System.out.println("Balance for " + customer.getName() + " now is " +
//                customer.getBalance());


        ArrayList<Integer> myInts = new ArrayList<Integer>();
        myInts.add(1);
        myInts.add(2);
        myInts.add(3);
        myInts.add(4);

        for (int i=0; i<myInts.size(); i++) {
            System.out.println(i + ": " + myInts.get(i));
        }

        myInts.add(1, 5);

        for (int i=0; i<myInts.size(); i++) {
            System.out.println(i + ": " + myInts.get(i));
        }









    }
}
