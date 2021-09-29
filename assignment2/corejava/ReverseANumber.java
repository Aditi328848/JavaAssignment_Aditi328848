package assignment2.corejava;

public class ReverseANumber {
public static void main(String[] args) {
		
	ReverseANumber rv = new ReverseANumber();
		rv.reversenumber(123);
		rv.reversenumber(5);

	}

	private void reversenumber(int number) {
		
		/* 0
		 * 123 
		 * 
		 * 123%10 = 3
		 * 0*10+3
		 * 123/10 = 12
		 * num = 12
		 * 12%10 = 2
		 * 3*10+2
		 * 12/10 = 1
		 * 32*10+1
		 * 321
		 * 
		 */
		int reverse=0;
		int remainder=0;
		while(number!=0) {
			remainder = number%10;
			reverse = (reverse*10)+remainder;
			number = number/10;
		}
		System.out.println("Reverse of give number is " +reverse);
		
		
	}
}
