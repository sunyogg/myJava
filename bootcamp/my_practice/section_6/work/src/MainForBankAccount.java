public class MainForBankAccount {
    public static void main(String[] args) {
        //		BankAccount acc = new BankAccount("Bob", 7999527834L, 1234567890L,0);
//		BankAccount acc = new BankAccount();
        BankAccount acc = new BankAccount("Corey", 2323341413L);
        acc.withdraw(20);
        acc.deposit(20);
        acc.withdraw(3);
//		acc.withdraw(18);
        acc.deposit(2500);

        System.out.println(acc.getEmail());
        System.out.println(acc.getCustomerName());
    }
}


// Parameterized constructor ran!
// Empty constructor ran!

// when we called the empty constructor, it actually ran first, but the "this()"
// was called first and hence it called the parameterized constructor, so the
// parameterized constructor ran along with the print statement and after this()
// in the empty constructor has been finished executing it executed the next line
// which was a print statement.

// this() can be useful when you want to set the default value/fields/attributes
// of an object.

// call to 'this()' must be the first statement of the body of the constructor.