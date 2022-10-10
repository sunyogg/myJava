public class ObjinArray{
    public static void main(String[] args){
		     GoodDog[] pets;
		     pets = new GoodDog[7];
		     GoodDog one = new GoodDog();
		     GoodDog two = new GoodDog();
		     
		     // create two new Dog objects, and assign them to the 
		     // first two array element.
		     pets[0] = one;
		     pets[1] = two;
		     pets[2] = new GoodDog();

		     pets[0].setSize(65);
		     pets[1].setSize(40);
		     pets[2].setSize(15);

		     System.out.println(pets[0].getSize());
		     System.out.println(pets[1].getSize());
		     System.out.println(pets[2].getSize());
		     
		     pets[0].bark();
		     pets[1].bark();
		     pets[2].bark();
		     
    }// ends main function
}// ends Encapsulation class

class GoodDog{
    // make the instance variable private.
    private int size;

    // make the getter public.
    public int getSize(){
        return size;
    }

    // make the setter public.
    public void setSize(int usize){
        this.size = usize;
    }

		 void bark(){
				if (size >= 60){
					 System.out.println("wurff wurff");
				}
				else if (20<size && size<60){
						System.out.println("Ruff Ruff");
				}
				else{
				System.out.println("yip yip");
				}
		 }
}