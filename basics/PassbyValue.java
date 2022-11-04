public class PassbyValue{
	public static void main(String[] args){
		// 1) Declare an int variable and assign it the value 7.
		int x = 7;

		// 3) Call the go(), passing variable x as the argument.
		//    The bits of x are copied, and the copy lands in z.
		go(x);

	}

	// 2) Declare a method with an int parameter named z.
	static void go(int z){
		// 4) change the value of z inside the method.
		z = 0;
	}
}