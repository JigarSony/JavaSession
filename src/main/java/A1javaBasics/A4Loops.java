package A1javaBasics;

public class A4Loops {

	public static void main(String[] args) {

		//1. While Loop
		//repeate task again
		//neglate repeatative code
		//if you don't get incremental/decremental ...infinite loop -- disadvantage : it will generate infinite loop if you don't give 
		//incremental/decremental part


		int i = 1; //Initialisation
		while(i<=10) { //condition
			System.out.println(i);
			i=i+1; //incremental/decremental
		}

		int k = 10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		System.out.println("************ ");

		//2. For Loop
		//j+1 = j++;
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
		
		for(int l = 10;l>=1;l--) {
			System.out.println(l);
		}

		/**
		 * Output:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 * 10
		 * 9
		 * 8
		 * 7
		 * 6
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 * ************
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * 10
		 * 10
		 * 9
		 * 8
		 * 7
		 * 6
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 */
	}

}
