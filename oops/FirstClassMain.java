package myJava.oops;// you will be able to access the method and attributes of SecondClass.java if they are
// situated in same directory.

public class FirstClassMain{
	public static void main(String[] args){
		SecondClass secObj = new SecondClass();
		System.out.println(secObj.x);
		secObj.increment(25);
		System.out.println(secObj.x);
	}
}