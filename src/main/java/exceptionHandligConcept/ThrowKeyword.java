package exceptionHandligConcept;

public class ThrowKeyword {

	public static void main(String[] args)  {
		/*
		 * What is throw?
		 * What is different between throws and throw?
		 * Throw an exception deliberately - custom exception
		 * some time happen that some exception not in java
		 * so you can create the exception
		 * by throw keyword 
		 */
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Jigar Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");
		
		String Excel_flag = " ";
		
		if(Excel_flag.equals(" ")) {
			
			try {
				throw new Exception("Excel flag is Blank Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("XYZ");
			
		}
	}

}
