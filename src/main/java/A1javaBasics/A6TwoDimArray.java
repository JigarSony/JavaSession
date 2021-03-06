package A1javaBasics;

public class A6TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String [3][5]; //declaration
		System.out.println(x.length); //total # of rows : 3
		System.out.println(x[0].length); //total # of column : 5
		
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		x[1][4] = "E1";
		
		//3rd row
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		x[2][4] = "E2";
		
		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		
		//print all the values of 2d array : use for loop
		
		for(int row = 0;row<x.length;row++) {
			
			for(int col=0;col<x[0].length;col++) {
				System.out.print(x[row][col]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	/**
	 * output:
	 * 3
	 * 5
	 * C1
	 * C2
	 * A B C D E
	 * A1 B1 C1 D1 E1
	 * A2 B2 C2 D2 E2
	 */
}
