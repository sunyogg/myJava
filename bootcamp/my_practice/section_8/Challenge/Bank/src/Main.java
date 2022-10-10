public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank of Baroda");
        bank.addBranch("Jabalpur");
        bank.addCustomer("Jabalpur", "Tim", 100);
        bank.addCustomer("Jabalpur", "Mike", 45);

        bank.addCustomerTransaction("Jabalpur", "Tim", 50);
        bank.addCustomerTransaction("Jabalpur", "Mike", 5);

        bank.listCustomer("Jabalpur");
        bank.findBranch("Jabalpur").printCustomer();

    }
}