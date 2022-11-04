package myJava.bootcamp.section8.challenge.bank;
import java.util.ArrayList;

public class Customer {

    private String customerName;
    private double initialTransaction = 0;
    private ArrayList<Double> transactions =  new ArrayList<Double>();

    public Customer(String customerName, double initialTransaction) {
        this.customerName = customerName;
        this.initialTransaction = initialTransaction;
        if (initialTransaction > 0) {
            this.transactions.add(initialTransaction);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransaction() {
        return this.transactions;
    }

    public double getInitialTransaction() {
        return this.initialTransaction;
    }

    public void addTransaction(double transactionAmount) {
        transactions.add(transactionAmount);
    }

    public void printTransactions() {
        if (transactions == null) {
            System.out.println("No Transaction History yet.");
        } else {
            for(int i=0; i<transactions.size(); i++) {
                System.out.println((i + 1) + ". " + transactions.get(i));
            }
        }
    }

    public static Customer createCustomer(String name,
                                          double initialTransaction) {
        return new Customer(name, initialTransaction);
    }
}
