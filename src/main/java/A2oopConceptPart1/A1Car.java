package A2oopConceptPart1;

public class A1Car {

	//Class variables
	//global variables

	int mod;
	int wheel;

	public static void main(String[] args) {
		//Class: is a kind of entity where we have to define properties and methods and variables
		//variable and class is characteristic of class

		//Object : you have to create physical entity of the car class

		A1Car a = new A1Car();
		//rhs  = Object
		//new keyword is use to create the  object
		//new A1Car() : -- Object of car class
		//a is object reference variable

		A1Car b = new A1Car();
		A1Car c = new A1Car();


		a.mod = 2015;
		a.wheel = 4;

		b.mod = 2014;
		b.wheel = 4;

		c.mod = 2013;
		c.wheel = 4;

		System.out.println("Before assigning references");

		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);

		System.out.println(c.mod);
		System.out.println(c.wheel);

		System.out.println("After assigning references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
		System.out.println(c.mod);

//		System.out.println(a.mod);
//		System.out.println(a.wheel);
//
//		System.out.println(b.mod);
//		System.out.println(b.wheel);
//
//		System.out.println(c.mod);
//		System.out.println(c.wheel);
	}

}
