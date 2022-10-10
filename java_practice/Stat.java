public class Stat{
	public static void main(String[] args){
		String x = bark();
		System.out.println(x);
	}
	
	// sometimes we need to create methods that don't need any 
	// instance to access them, that's where the keyword static
	// comes handy.
	// here i want a method to output "barked".
	// if i would have done that normally then i would have created
	// a dog instance and then used that instance to access bark()
	// method, but using static I can do that without creating an 
	// instance.
	public static String bark(){
		return ("Barked!");
	}
}

	