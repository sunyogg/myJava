package myJava.oops.Revise.properties.inheritance.basics;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(new Box(1, 2, 3));
//        BoxWeight bw = new BoxWeight();
//        BoxWeight bww = new BoxWeight(1, 2, 3, 4);
//        System.out.println(bww.length);
//        System.out.println(bww.width);
//        System.out.println(bww.height);
//        System.out.println(bww.weight);
//
//        Box box = new Box(new BoxWeight(2, 4, 6, 8));
        // same as line 26.
//        System.out.println(box.height);
//        System.out.println(box.length);
//        System.out.println(box.width);

        // It is the type of the reference variable and not the type of the
        // object that actually determines what members can be accessed.
        // I think the funny thing here is that we are using the child constructor
        // to create a parent class instance. And maybe just maybe BoxWeight() i.e.
        // the constructor of child class automatically calls super() which invokes
        // the parent class constructor. And since we are using the parent constructor
        // we are not able to initialize the child field(weight).
//        Box b = new BoxWeight(); // debug from here to understand
//        System.out.println(b.weight);
        // so we can say 'b' is the object of class Box and BoxWeight.


        // And here we are trying to create a child instance using the
        // constructor of parent class and remember parent class cannot create
        // instance of child class because it does not have anything like super()
        // which would help it to call the constructor of child class. So here
        // we are using the 'raw' parent class constructor to create a child class
        // instance which is just not possible.

        // In video:
        // There are many variables in both parent class and child classes.
        // You are given access to variable that are in the ref type i.e. BoxWeight
        // hence, you should access the weight variable, this also means, that the
        // ones you are trying to access should be initialized, but here, when the
        // object itself is of parent class, how will you call the constructor of
        // child class.
//        BoxWeight bb = new Box();
//        System.out.println(b.length);
        BoxPrice bp = new BoxPrice(); // debug here to understand.

        BoxPrice bpp = new BoxPrice(bp); // debug here to understand.















    }
}