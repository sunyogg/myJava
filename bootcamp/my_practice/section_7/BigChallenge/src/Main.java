public class Main {
    public static void main(String[] args) {
        BaseBurger burger = new BaseBurger(false, true, true, false, true);
        burger.getListOfItems();
        System.out.println(burger.getTotalCost());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger(true, true, true);
        healthyBurger.getListOfItems();
        System.out.println(healthyBurger.getTotalCost());
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.getListOfItems();
        System.out.println(deluxeBurger.getTotalCost());
    }
}