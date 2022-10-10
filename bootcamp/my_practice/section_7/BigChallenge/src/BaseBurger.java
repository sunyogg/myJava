public class BaseBurger {

    // base
    private boolean breadRoll = true;
    final private boolean tomato = true;
    final private boolean onion = true;
    final private boolean lettuce = true;
    final private boolean ketchup = true;


    // additions
    private boolean meat;
    private boolean mayonnaise;
    private boolean cheese;
    private boolean egg;
    private boolean masala;

    // cost
    final private double baseCost = 1.7;
    private double additionCost = 0;

    public BaseBurger(boolean meat, boolean mayonnaise, boolean cheese,
                      boolean egg, boolean masala) {


        this.meat = meat;
        if (this.meat) {
            additionCost += 1;
        }

        this.mayonnaise = mayonnaise;
        if (this.mayonnaise) {
            additionCost += 0.6;
        }

        this.cheese = cheese;
        if (this.cheese) {
            additionCost += 0.7;
        }

        this.egg = egg;
        if (this.egg) {
            additionCost += 0.6;
        }

        this.masala = masala;
        if (this.masala) {
            additionCost += 0.8;
        }
    }

    public double getAdditionCost() {
        return this.additionCost;
    }

    public double getTotalCost() {
        return ( this.getAdditionCost() + this.getBaseCost());
    }

    public double getBaseCost() {
        return this.baseCost;
    }

    public void getListOfItems() {

        // printing the base items.
        System.out.println("The burger you ordered contains: ");
        System.out.println("\t-> BreadRoll (0.3$)");
        System.out.println("\t-> Tomato (0.4$)");
        System.out.println("\t-> Onion (0.2$)");
        System.out.println("\t-> Lettuce (0.6$)");
        System.out.println("\t-> Ketchup (0.2$)");

        // print the additional items.
        if (this.meat) {
            System.out.println("\t-> Meat (1$)");
        }
        if (this.mayonnaise) {
            System.out.println("\t-> Mayonnaise (0.6$)");
        }
        if (this.cheese) {
            System.out.println("\t-> Cheese (0.7$)");
        }
        if (this.egg) {
            System.out.println("\t-> Egg (0.6$)");
        }
        if (this.masala) {
            System.out.println("\t-> Masala (0.8$)");
        }
    }

}