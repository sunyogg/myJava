package java.bootcamp.section6.inheritance0;

public class Animals {

    private String name;
    private int brain;
    private int body;
    private int weight;
    private int size;

    public Animals(String name, int brain, int body, int weight, int size) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;
    }

    public void eat() {
        System.out.println("Animal.eat() was called.");
    }

    public void move(int speed) {
        System.out.println("Animal.move() is moving at speed " + speed +".");
    }

    public void run() {
        System.out.println("Animal.run() was called.");
    }

    public String getName() {
        return this.name;
    }

    public int getBrain() {
        return  this.brain;
    }

    public int getBody() {
        return this.body;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }
}