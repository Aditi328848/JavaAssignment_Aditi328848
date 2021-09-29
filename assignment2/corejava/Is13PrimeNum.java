package assignment2.corejava;

public class Is13PrimeNum {
	public void isPrime(int isPrime) {
		int count=0;
		for (int i = 2; i <= isPrime/2; i++) {
			if(isPrime%i == 0) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println(isPrime + " is not a PrimeNumber");
		}else {
			System.out.println(isPrime + " is a Prime Number");
		}
	}
	
	
	public static void main(String[] args) {
		Is13PrimeNum iP = new Is13PrimeNum();
		iP.isPrime(13);
		iP.isPrime(12);
			

	}

}
