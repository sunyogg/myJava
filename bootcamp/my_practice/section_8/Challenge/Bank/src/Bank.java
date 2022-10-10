
import java.util.Scanner;
import java.util.ArrayList;

public class Bank {

    private static Scanner input = new Scanner(System.in);
    public static ArrayList<Branch> branches = new ArrayList<Branch>();
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public boolean addBranch(String branchName) {
        Branch branch = new Branch(branchName);
        branches.add(branch);
        System.out.println("Branch Added SuccessFully");
            return true;
    }

    public  boolean addCustomer(String branchName, String customerName,
                             double initialTransaction) {
        Branch branch = new Branch(branchName);
        Customer customer = Customer.createCustomer(customerName,
                initialTransaction);
        branch.newCustomer(customerName, initialTransaction);
        return true;

    }

    public boolean addCustomerTransaction(String branchName,
                        String customerName, double transactionAmount) {
        Branch branch = new Branch(branchName);
        branch.addCustomerTransaction(customerName, transactionAmount);
        return true;

    }

    public Branch findBranch(String branchName) {
        for (int i=0; i<branches.size(); i++) {
            if (branches.get(i).getBranchName() == branchName) {
                return branches.get(i);
            }
        }
        return null;
    }



    public void listCustomer(String whichBranch) {
        if (findBranch(whichBranch) == null) {
            System.out.println("Enter valid branch name: ");
        }
        else {
            ///////////////////////////////////////////////////
            ArrayList<Customer> list =  findBranch(whichBranch).getCustomer();
            for (int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }

}
