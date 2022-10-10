import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return this.name;
    }

    private Branch findBranch(String branchName) {
        for (int i=0; i<branches.size(); i++) {
            Branch checkBranch = branches.get(i);
            if (checkBranch.getName().equals(branchName)) {
                return checkBranch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return true;
        }
        System.out.println("Branch already Exist.");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName,
                               double initialTransaction) {
        Branch checkBranch = findBranch(branchName);
        if (checkBranch != null) {
            return checkBranch.newCustomer(customerName, initialTransaction);
        }

        System.out.println("Customer already exist");
        return false;
    }

    public boolean addCustomerTransaction(String branchName,
                                          String customerName,
                                          double transactionAmount) {
        Branch checkBranch = findBranch(branchName);
        if (checkBranch != null) {
            if (checkBranch.addCustomerTransaction(customerName,
                    transactionAmount)) {
                return true;
            }
        }
        return false;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {
        Branch checkBranch = findBranch(branchName);
        if (checkBranch != null) {
           ArrayList<Customer> branchCustomers = checkBranch.getCustomers();
           System.out.println("Customer detail for branch " + checkBranch.getName());
            for (int i=0; i<branchCustomers.size(); i++) {
                System.out.println();
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + " ["+(i+1)+"]");
                if (showTransactions) {
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    System.out.println("Transactions");
                    for (int j=0; j<transactions.size(); j++) {
                        System.out.println("["+(j+1)+"]" + transactions.get(j));
                    }
                }
            }
            return true;
        }
        System.out.println("Error");
        return false;
    }


}
