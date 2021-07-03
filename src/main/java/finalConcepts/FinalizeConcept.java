package finalConcepts;

public class FinalizeConcept {

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		//there is no object reference 
		//two blank objects are there / w/o any reference inside the memory
		
		//garbage collector - distructor(c/c++)
		//automatically it called
		//it destroy all this object - to free some space memory
		
		//finalise keyword is use to clean up
		/*
		 * how to call garbage collector manually ??
		 * System.gc();
		 */
		
		
		System.gc();
		
		/*
		 * finalize is method
		 */
	}
	
	public void finalize() {
		System.out.println("finalize method");
	}

	/*Finalize : is some thing related to the garbage collector
	 * use to perform the clean up memory processing
	 * like inside the memory there are lot of garbage is there lot of objects are there
	 * it doesn't have any references
	 * just before we're calling garbage collector if you're declare that particular method
	 * as a Finalize - it will start cleaning of the process
	 */
}
