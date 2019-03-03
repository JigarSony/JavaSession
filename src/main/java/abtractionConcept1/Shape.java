package abtractionConcept1;

public abstract class Shape {
	
	//we can create constructor of abstract class
	//but unable to create constructor of interface
	Shape(){
		System.out.println("Shape class constructor");
	}

	int color;

	//c++ virtual method
	//java abstract method
	abstract  void drawing();

	//non abstract method
	//can not create object of abstract class 
	public void fill() {
		System.out.println("Shape -- fill");
	}
	
	//In abstract class we get 0-100% abstraction
	//abstraction is process of hiding the implementation details

}
