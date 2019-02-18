package interfaceConcept1;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW -- Start");
	}

	@Override
	public void stop() {
		System.out.println("BMW -- Stop");
	}

	@Override
	public void refuel() {
		System.out.println("BMW -- Rfuel");
	}
	
	//non overridden method 
	public void theftsafetymethod() {
		System.out.println("BMW -- theftsafety");
	}

}
