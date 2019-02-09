package coreJava;

public class PrimeNumber {
	static int num;
	public static void main(String[] args) {
		//System.out.println(num + ":Is a Prime Number?: "+ isPrimeNumber(2));
		getPrimeNumber(20);
	}
	
	public static boolean isPrimeNumber(int num) {
		//Prime # is completely divided by it's own and  1.
		//2 is lowest prime number
		
		
		if(num<=1) {
			return false;
		}
		
		for(int i =2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
				
		}
		return true;
		
	}
	
	public static void getPrimeNumber(int num) {
		for(int i=2; i<num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+ " ");
			}
		}
	}
}
