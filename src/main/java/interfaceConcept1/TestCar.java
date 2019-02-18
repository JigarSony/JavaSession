package interfaceConcept1;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftsafetymethod();
		
		//dynamic polymorphism
		//top casting
		//parent interface reference variables
		Car c = new BMW();
		//child class object can be referred by parent/interface class variable
		c.start();
		c.start();
		c.refuel();
		//c.theftsafetymethod();
		//not allowed
	}

}
