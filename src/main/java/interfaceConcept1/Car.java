package interfaceConcept1;

public interface Car {
	
	//always define abstract method
	//no method body
	//only method declaration
	//no need to write abstract keyword
	//we are achieve 100% abstraction
	//cannot create the object of interface
	//only final and static variables only
	
	int wheel = 4;
	//by default final static variable
	
	//by default abstract method
	public void start();
	public void stop();
	public void refuel();
}
