
public class Dogs extends Animals {

    private int eyes;
    private int teeth;
    private int tail;
    private int legs;
    private String coat;

    public Dogs(String name, int brain, int body, int weight, int size, int eyes,
                int teeth, int tail, int legs, String coat) {
        super(name, brain, body, weight, size);

        this.eyes = eyes;
        this.teeth = teeth;
        this.tail = tail;
        this.legs = legs;
        this.coat = coat;
    }

    @Override // you don't have to write this.
    public void eat() {
        System.out.println("Dog.eat() was called");

        super.eat(); // this will call the eat method of Animal parent class.
        // Animal.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() was called.");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() was called.");
        move(10);
    }

    public void move(int speed) {
        System.out.println("Dog.move() is moving at " + speed + ".");
    }


}











// itne parameter to super initialize or assign karr dega.
// parr jo dog ke khudd ke hain unhe humein manually assign karna padega.
// so now the child class has the attributes that the parent class has but
// it also has it's own unique sets of attributes.









/*
super() calls the constructor of the parent class for the child class
like:

super(name, brain, body, weight, size);

public ParentClass(String name, int brain, int body, int weight, int size) {
    this.name = name;
    this.brain = brain;
    this.body = body;
    this.weight = weight;
    this.size = size;
}
 */