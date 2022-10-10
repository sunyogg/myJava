
// '==' is used to compare two variables, it actually compares the bits that those
// variable holding.
// equals() compares two method and check if they are equal or not.


public class Comparing{
	public static void main(String[] args){
		// remember "==" checks the bits of primitives or reference.
		int x = 10;
		int y = 10;
		//System.out.println(x==y);
		String name = "Sunyog";
		String nickname = "Sunyog";
		//System.out.println(name==nickname);
		//System.out.println(name.equals(nickname));

		Foo one = new Foo();
		Foo two = new Foo();
		Foo three = one;
		// three == one = true because the one and three are reference variable and they are
		// pointing to same object that means they contains bits that have equal pattern
		// since they are pointing to the same object.

		//System.out.println("one: "+one);
		//System.out.println("two: "+two);
		//System.out.println("three: "+three);

		//System.out.println("one and two: "+one.equals(two));
		//System.out.println("one and three: "+one.equals(three));

		System.out.println("one and two: "+(one == two));
		System.out.println("one and three: "+ (one == three));

	}
}

class Foo{

}