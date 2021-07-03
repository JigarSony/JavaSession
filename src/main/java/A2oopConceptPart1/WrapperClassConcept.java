package A2oopConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//data conversion  : String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to charcter -- dont have 
		
		//String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//int to String
		int j = 200;
		System.out.println(j+20);
		
		String str = String.valueOf(j);//"200"
		System.out.println(str+20);		
		
		
		String u ="100A";
		//Integer.parseInt(u); //exception : number format exception for the input string --"100A"
		//java.lang.NumberFormatException

		/**
		 * output:
		 * 10020
		 * 120
		 * 22.33
		 * true
		 * 220
		 * 20020
		 */
	}
}
