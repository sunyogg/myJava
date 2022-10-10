public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank Of Australia");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 100.453);
        bank.addCustomer("Adelaide", "mike", 200.43);
        bank.addCustomer("Adelaide", "percy", 250.23);

        bank.addCustomerTransaction("Adelaide", "Tim", 12.23);
        bank.addCustomerTransaction("Adelaide", "Tim", 149);
        bank.addCustomerTransaction("Adelaide", "mike", 452);

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 23);

        bank.listCustomer("Adelaide", false);

//        if (!bank.addBranch("Adelaide")) {
//            System.out.println("Adelaide already exist.");
//        }

    }
}
