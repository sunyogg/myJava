package myJava.oops;

public class DogTestDrive{
	public static void main(String[] args){
		// the dog test code goes here.
		Doggy d1 = new Doggy();
		d1.bark();
		d1.size = 20;
		d1.describe_dog();
		System.out.println("");
		Doggy d2 = new Doggy();
		d2.bark();
		d2.size = 25;
		d2.describe_dog();
		
	}
}

class Doggy{
	// instance variable.
	int size;
	String name;
	String breed;
	String color;
	String type;

	// a method
	void bark(){
	System.out.println("WWuff! WWuff!");
	}

	// another method
	void describe_dog(){
		System.out.println(size);
	}
}
















