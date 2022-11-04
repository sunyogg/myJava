package myJava.bootcamp.section6.work;

public class BankAccount {

    private String customerName;
    private long phoneNumber;
    private String email;
    private long accountNumber;
    private long balance;


    // constructor

    public BankAccount() {
        this("DefaultUser", 00000000000L, 0000000000L,0);
        System.out.println("Empty constructor ran!");
    }

    public BankAccount(String customerName, long phoneNumber,
                       long accountNumber, long balance) {
        System.out.println("Parameterized constructor ran!");
        // using setter in a constructor.
        setCustomerName(customerName);
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.email = customerName.toLowerCase() + "@bank.country.com";
        this.balance = balance;
    }

    public BankAccount(String customerName, long phoneNumber) {
        this(customerName, phoneNumber, 00000, 0);
        System.out.println("Third constructor was called.");
    }

    // setters
    public void setCustomerName(String name){
        this.customerName = name;
    }

    public void setPhoneNumber(long number) {
        this.phoneNumber = number;
    }

    public void setAccountNumber(long number) {
        this.accountNumber = number;
    }

    public void setEmail() {
        this.email = this.customerName.toLowerCase() + "@bank.country.com";
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    // getters
    public String getCustomerName() {
        return this.customerName;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public long getBalance() {
        return this.balance;
    }

    // additionals

    public void deposit(int amount) {
        if (amount < 20000) {
            this.balance += amount;
            System.out.println(amount + "$ has been deposited. Current balance" +
                    " is " + this.balance + "$.");
        }else {
            System.out.println("Depositing amount should be less than 20000$.");
        }
    }

    public void withdraw (int amount) {
        if ((amount < this.balance) && (amount < 2000 )) {
            this.balance -= amount;
            System.out.println(amount + "$ has been withdrawn. Total amount " +
                    "is " + this.balance + "$.");
        } else if (amount > this.balance) {
            System.out.println("You only have " + this.balance + "$ in your" +
                    " account. Withdrawal of  " + amount + "$ " +
                    "cannot be processed.");
        }
        else {
            System.out.println("withdrawal limit exceeded.");
        }
    }
}