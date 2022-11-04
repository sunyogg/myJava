package java.oops;
// when an object is stored in an array, it's actually the
// reference variable (remote control of that object) that is 
// stored inside that array. 


public class DoginArray{
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.name = "Tuffy";
		d1.breed = "Labrador";
		d1.color = "Golden";
		d1.age = 6;
		d1.weight = 30;
		d1.size = 25;
		
		Dog[] dogarr = new Dog[2];
		dogarr[0] = d1;
		dogarr[1] = new Dog();

		// we can say here reference variable is dogarr[0].
		// since reference variable of d1 is stored at dogarr[0].
		System.out.println("Reference variable of d1: "+dogarr[0]);
		System.out.println(dogarr[0].name);
		System.out.println(dogarr[0].age);
		System.out.println(dogarr[0].breed);
		System.out.println(dogarr[1].name);

		
	}
}

class Dog{
	// instance variable.
	String name;
	String breed;
	String color;
	int age;
	int weight;
	int size;


	void describe(){
		System.out.println(this.name);
		System.out.println(this.breed);
		System.out.println(this.color);
		System.out.println(this.age);
		System.out.println(this.weight);
		System.out.println(this.size);
	}

	void bark(){
		System.out.println("\nWuff!! Wuff!!");
	}
}






















