package java.bootcamp.section7.bigchallenge;

public class HealthyBurger extends BaseBurger {

    final private boolean brownRyeBreadRoll = true;
    final private double baseCost = 1.4D;
    private boolean pickles;
    private boolean avocado;
    private boolean mushroom;
    private double additionCost;

    public HealthyBurger( boolean pickles, boolean avocado, boolean mushroom) {
        super(false, false, false, false, false);

        this.additionCost += 1; // brown bread.

        this.pickles  = pickles;
        if (this.pickles) {
            this.additionCost += 1.5;
        }
        this.avocado = avocado;
        if (this.avocado) {
            this.additionCost += 1.7;
        }
        this.mushroom = mushroom;
        if (this.mushroom) {
            this.additionCost += 1.9;
        }
    }

    public void getListOfItems() {

        // printing the base items.
        System.out.println("The burger you ordered contains: ");
        System.out.println("\t-> BrownRyeBreadRoll (1$)");
        System.out.println("\t-> Tomato (0.4$)");
        System.out.println("\t-> Onion (0.2$)");
        System.out.println("\t-> Lettuce (0.6$)");
        System.out.println("\t-> Ketchup (0.2$)");

        // print the additional items.
        if (this.pickles) {
            System.out.println("\t-> Pickles (1.5$)");
        }
        if (this.avocado) {
            System.out.println("\t-> Avocado (1.7$)");
        }
        if (this.mushroom) {
            System.out.println("\t-> Mushroom (1.9$)");
        }
    }

    public double getAdditionCost() {
        return this.additionCost;
    }

    public double getBaseCost() {
        return this.baseCost;
    }
}