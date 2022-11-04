package java.oops;
// static method v/s non-static method

//  we created a 'static' method, which means that it can be accessed without 
// creating an object of the class, unlike 'public', which can only be 
// accessed by objects:


public class JavaOops2{

	static void myStaticMethod(){
		System.out.println("Static method can be called without creating objects.");
	}
	
	void myPublicMethod(){
		System.out.println("Public method must be called by creating objects.");
	}

	public static void main(String[] args){
		myStaticMethod();
		//myPublicMethod(); // error: because we need to create objects to access 
							// 		  non-static methods

		// creating object to access non-static method.
		JavaOops2 myObj = new JavaOops2();
		myObj.myPublicMethod();
	}	


}

















