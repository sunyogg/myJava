package java.bootcamp.section6.challenges;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		if (age > 0 && age < 115){
			this.age = age;
		}
		else {
			this.age = 0;
		}
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getFullName() {
		return (this.firstName + " " + this.lastName);
	}

	public int getAge() {
		return this.age;
	}

	public boolean isTeen() {
		if (this.age >= 13 && this.age <=19) {
			return true;
		}
		return false;
	}
}