package java.oops;

public class GetterandSetters{
	public static void main(String[] args){
		Car c1 = new Car();
		c1.constructor("model S", "tesla", 250, "electric");
		c1.getDetails();
		System.out.println();
		c1.setName("Model Alpha");
		c1.getDetails();
		System.out.println();
		System.out.println(c1.getTopSpeed());		

	}// ends main function
}// ends GettersandSetters class


class Car{
	String name;
	String brand;
	int topspeed;
	String type;


	void constructor(String name, String brand, int topspeed, String type){
		this.name = name;
		this.brand = brand;
		this.topspeed = topspeed;
		this.type = type;
	}


	// a getter
	String getName(){
		return this.name;
	}

	// a setter
	void setName(String uname){
		this.name = uname;
	}

	// another getter
	int getTopSpeed(){
		return this.topspeed;
	}

	// another setter
	void setType(String utype){
		this.type = utype;
	}

	// a getter that will print every detail of the car.
	void getDetails(){
		System.out.println(name.toUpperCase());
		System.out.println(brand.toUpperCase());
		System.out.println(topspeed);
		System.out.println(type.toUpperCase());
	}

}// ends Car class














