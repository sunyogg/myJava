package myJava.oops;

public class Encapsulation{
    public static void main(String[] args){
		     GoodDog one = new GoodDog();
		     System.out.println(one.size);
		     // this won't work: one.size = 23
		     // this too won't work: System.out.println(one.size);
		     one.setSize(65);
		     System.out.println(one.getSize());
		     GoodDog two = new GoodDog();
		     two.setSize(15);
		     System.out.println(two.getSize());
		     one.bark();
		     two.bark();
    }// ends main function
}// ends Encapsulation class

class GoodDog{
    // make the instance variable private.
    public int size;

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