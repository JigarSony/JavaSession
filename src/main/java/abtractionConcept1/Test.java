package abtractionConcept1;

public class Test extends Shape{
	
	Test(){
		System.out.println("Test class constructor");
	}
	
	public static void main(String[] args) {
		
		//unable to create
		//Shape s = new Shape();
		
//		Shape s = new Test();
//		
//		s.drawing();
//		s.fill();
		
		Test test = new Test();
			
			
	}

	@Override
	void drawing() {
		System.out.println("Test -- Drawing");
	}

}
