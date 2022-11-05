package myJava.oops.Revise.staticvar;

public  class StaticBlock {
    public static void main(String[] args) {

    }

    static {
        // In this block, you initialize all the static variables.
        System.out.println("This will only once, when the class is loaded.");
        int a = 7;
        boolean s = false;
    }

}
