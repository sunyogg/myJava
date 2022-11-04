package myJava.oops;
// constructor in java

public class JavaOops3{
	int x;
	
	// a constructor
	// it cannot have return type like: void, String or int.
	// you can also pass argument in a constructor.
	public JavaOops3(int num){
		x = num;
	}

	public static void main(String[] args){
		JavaOops3 myObj = new JavaOops3(2);
		System.out.println(myObj.x);
	}
}