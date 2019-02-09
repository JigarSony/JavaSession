package oopConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//MethodOverriding
		//Whenever method is common in child as well as parent class -- preference will be given to child class
		//When same method present in parent and child class as well as with same name and same # of args is called method overriding
		
		//static polymorphisam -- compile time polymorphisam
		//at time of compilation java will decide which method need to call
		//polymorphisam : one to many
		
		BMW b = new BMW();
		b.start();
		
		b.stop();
		
		b.refuel();
		
		b.thesafety();
		
		b.engine();
		System.out.println("*****");
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		//parent can not access properties from child class
		
		//Top Casting : small thing fit into big things child fit in parent 
		Car c1 = new BMW();
		//child class object can be referred by parent class reference variable -- dynamic polymorphism -- run time polymorphisam
		c1.start();
		c1.stop();
		c1.refuel();
		
		//only common and parent class method can access by dynamic polymorphism
		//only by access compile time polymorphism
		
		//Down Casting : not allowed
		//BMW b1 = (BMW) new Car(); //casting into BMW class
		//gives Class Cast Exception
	}

}
 