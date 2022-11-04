package java.bootcamp.section6.challenges;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {

        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        // this method will need to calculate the total cost to cover the floor with
        // carpet.

        return (floor.getArea() * carpet.getCost());


    }
}