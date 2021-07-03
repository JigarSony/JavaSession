package methodOverridingConcept;

public class Car extends Vehicle{
	
	//Inheritance : inherit some properties from parents but parent doesn't inherit from child class
	//Parent have multiple child but child not have multiple parent
	//Types of Inheritance : 
	// Single(A<-B),MultiLevel(A<-B<-C),Hierarchical(A<-B,A<-C,A<-D)
	//Multiple(A,B is parent ,C is child of A and B),Hybrid(A<-B,A<-C,B<-D,C<-D) - through interface

	public void start() {
		System.out.println("A1Car --- Start");
	}
	
	public void stop() {
		System.out.println("A1Car --- Stop");
	}
	
	public void refuel() {
		System.out.println("A1Car --- Refuel");
	}
}
