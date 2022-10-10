
public class Dog2{
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.name = "tuffy";
		d1.size = 23;
		d1.bark(4);
	}
}

class Dog{
	String name;
	int size;

	// method whose behavior will depend on the state of the class.
	// using argument in method.

	void bark(int numofbarks){
		while (numofbarks>0){ 
			if (size< 20){ // study about variable scoping.
				System.out.println("wuff! wuff!");
			}else{
				System.out.println("fuk! fuk!");
			}
		numofbarks = numofbarks - 1;
		} // ends while loop
	} // ends bark method
} // ends dog class











