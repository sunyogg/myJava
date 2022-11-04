package java.bootcamp.section7.bigchallenge;

public class DeluxeBurger extends BaseBurger {

    final private boolean drinks ;
    final private boolean chips;
    final private double additionCost;
    final private double baseCost = 1.7;

    public DeluxeBurger() {
        super(false, false, false, false, false);
        this.drinks = true;
        this.chips = true;
        this.additionCost = 4 + 5;
    }

    public void getListOfItems() {
        // printing the base items.
        System.out.println("The burger you ordered contains: ");
        System.out.println("\t-> BreadRoll (0.3$)");
        System.out.println("\t-> Tomato (0.4$)");
        System.out.println("\t-> Onion (0.2$)");
        System.out.println("\t-> Lettuce (0.6$)");
        System.out.println("\t-> Ketchup (0.2$)");

        System.out.println("\t-> Drinks (5$)");
        System.out.println("\t-> Chips (4$)");
    }

    public double getAdditionCost() {
        return this.additionCost;
    }

    public double getBaseCost() {
        return this.baseCost;
    }


}