package java.oops;

public class EmployeeTest{
	public static void main(String[] args){

	Employee emp1 = new Employee("Corey", "Schafer", 37, 150000, "python", 12);
	Employee emp2 = new Employee("John", "Doe", 28, 60000, "python", 3);

	//emp1.describe();
	emp1.incrementPay(11000);
	System.out.println(emp1.ipay);
	System.out.println();
	emp2.incrementPay(8000);
	System.out.println(emp2.ipay);
	//emp2.describe();

	}
}

class Employee{
	String fname;
	String lname;
	int iage;
	int ipay;
	String language;
	int experience;
	String email;
	
	// creating a constructor
	public Employee(String first, String last, int age, int pay, String lang, int exp) {
		fname = first;
		lname = last;
		iage = age;
		ipay = pay;
		language = lang;
		experience = exp;
		email = first.toLowerCase()+last.toLowerCase()+"@company.com";
	} // ends constructor

	// a method that will describe the Employee.
	void describe(){
		System.out.println(fname+"\n"+lname+"\n"+iage+"\n"+ipay+"\n"+language+"\n"+experience+"\n"+email);
	} // ends describe

	// a method that will increment the pay of employee.
	void incrementPay(int value){
		if (value > 10000){
			if (experience > 3){
				ipay += value;
			}
			else{
				System.out.println("Increment value cannot be more than 10000 for a junior developer.");
			}
		}
		else{
			ipay += value;
		} // ends if else
	} // ends incrementPay
} // ends Employee

















