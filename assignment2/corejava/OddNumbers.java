package assignment2.corejava;

public class OddNumbers {
	public static void main(String[] args) {
		/*
		 * Find all the odd numbers from 79 to 187
		 */
		System.out.println("Odd numbers between 79 to 187 are..");
		for (int i = 79; i <=187; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}

	}
}
