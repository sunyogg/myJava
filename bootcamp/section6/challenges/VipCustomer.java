package myJava.bootcamp.section6.challenges;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("defaultUser", 0, "defaultuser@org.country");
    }

    public VipCustomer (String name) {
        this(name, 1000);
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "defaultuser1@org.country");

    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}