package java.bootcamp.section8.challenge.betterbank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        transactions = new ArrayList<Double>();
        transactions.add(initialTransaction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double transactionAmount) {
        this.transactions.add(transactionAmount);
    }


}