public class JavaOops1{
	
	// you cannot assign or modify the value of a 'final' variable.
	int x = 25;
	final double pie = 3.14159;

	public static void main(String[] args){
		JavaOops myObj = new JavaOops();
		System.out.println(myObj.x);
		myObj.x = 13;
		System.out.println(myObj.x);
		myObj.pie = 2.14;  // this will generate an error.
		
	}
}