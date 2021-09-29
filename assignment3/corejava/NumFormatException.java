package assignment3.corejava;

public class NumFormatException {
	/*
	 * Write a program to throw NumberFormatException and handle it
	appropriately with a proper message.
	If you pass invalid input to parseInt(str), this exception will be thrown.
	 */
		public static void main(String[] args) {
			
			try {
				String str = "Chakri";
				int n  = Integer.parseInt(str);
			} catch (java.lang.NumberFormatException e) {
				System.out.println("Number format excpetion , please give proper value to convert integer");
			}

		}

}
