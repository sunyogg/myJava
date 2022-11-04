package myJava.bootcamp.section8.challenge.bank;

import java.util.Scanner;
import java.util.ArrayList;


public class Branch {

    private static Scanner input = new Scanner(System.in);
    private String branchName;
    public ArrayList<Customer> customers = new ArrayList<Customer>();


    public Branch(String branchName) {
        this.branchName = branchName;

    }

    public String getBranchName() {
        return this.branchName;
    }

    public void getCustomerName() {
        for (int i=0; i<customers.size(); i++) {
            System.out.println(customers.get(i).getCustomerName());
        }
    }

    public ArrayList<Customer> getCustomer() {
        return customers;
    }

    private Customer findCustomer(String customerName) {
        // check if the customer is in the list or not using their username.
        String name = customerName;
        for (int i=0; i<this.customers.size(); i++) {
            if (this.customers.get(i).getCustomerName().equals(name)) {
                return this.customers.get(i);
            }
        }
        return null;
    }

    public boolean newCustomer(String nameOfCustomer,
                               double initialTransaction) {
        if (customers.indexOf(findCustomer(nameOfCustomer)) >= 0) {
            System.out.println("Not added to ArrayList.");
            return false;
        } else {

            Customer customer = new Customer(nameOfCustomer, initialTransaction);
            this.customers.add(customer);
            System.out.println("Customer added to customers ArrayList");
            System.out.println(customers);
            return true;
        }
    }


    public boolean addCustomerTransaction(String name,
                                          double transactionAmount) {
        Customer customer = Customer.createCustomer(name, transactionAmount);
        for (int i=0; i<customers.size(); i++) {
            if (customers.get(i).getCustomerName().
                    toLowerCase().equals(name.toLowerCase())) {
                System.out.println("Customer already registered");
                customer.addTransaction(transactionAmount);
                return true;
            }
        }
//        customers.add(customer);
//        System.out.println("Customer added successfully");
        return false;
    }

    public void printCustomersArray() {
        for (int i=0; i<customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    public void printCustomer() {
        System.out.println(customers);
    }


}
