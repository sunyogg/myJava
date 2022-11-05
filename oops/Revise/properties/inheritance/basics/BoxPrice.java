package myJava.oops.Revise.properties.inheritance.basics;

public class BoxPrice extends BoxWeight {
    public double price;

    public BoxPrice() {
        this.price = -1;
    }

    public BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double length, double width, double height,
                    double weight, double price) {
        super(length, width, height, weight);
        this.price = price;
    }
}