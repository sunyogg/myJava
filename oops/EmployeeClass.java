package myJava.oops;

public class EmployeeClass{
	public static void main(String[] args){

		Employee emp1 = new Employee();

		emp1.construct("Corey Schafer", 35, "Junior Developer" ,75000);
		emp1.describe();
		emp1.incrementPay(8000);
		emp1.describe();
		
		Employee emp2 = new Employee();
		emp2.construct("Erich Mathes", 50, "Senior Python Developer", 200000);
		emp2.describe();
		emp2.incrementPay(10000);
		emp2.describe();
		
	}// ends main function.
} // ends Employee class



class Employee{
	String name;
	int age; 
	String role;
	int pay;
	
	// a constructor. Making a method that can be used as a constructor

	void construct(String name, int age, String role, int pay){
		this.name = name;
		this.age = age;
		this.role = role;
		this.pay = pay;
	}// ends construct
	
	void describe(){
		System.out.println("\n"+name);
		System.out.println(age);
		System.out.println(role);
		System.out.println(pay);
	
	} //ends describe method

	void incrementPay(int amount){
		if (amount <= 10000){
			this.pay = pay + amount;
		}else{
			System.out.println("You can't increment more than 10000 at a time.");
		}
	
	}// ends incrementPay


} //ends Employee class
















