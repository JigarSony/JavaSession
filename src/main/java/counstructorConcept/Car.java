package counstructorConcept;

public class Car {

	String name;
	String modelNumber;
	int price;
	String engine;

	public Car(String name, String modelNumber, int price, String engine) {
		this.name = name;
		this.modelNumber = modelNumber;
		this.price = price;
		this.engine = engine;
	}

	public static void main(String[] args) {

		Car obj1 = new Car("BMW", "350Z", 10, "AMT");
		Car obj2 = new Car("Audi", "A8", 20, "AMT");
		Car obj3 = new Car("Honda", "Civic", 5, "Manual");
		
		System.out.println(obj1.name +" "+obj1.modelNumber+" "+ obj1.price+" "+obj1.engine );
		System.out.println(obj2.name +" "+obj2.modelNumber+" "+ obj2.price+" "+obj2.engine );
		System.out.println(obj3.name +" "+obj3.modelNumber+" "+ obj3.price+" "+obj3.engine );
	}

}
