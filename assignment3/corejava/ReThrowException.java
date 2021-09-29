package assignment3.corejava;

public class ReThrowException {
	/*
	 * Write a program to re-throw an exception. (throw inside catch block)
	 */
		public static void main(String[] args) throws Exception {
			String name = null;

			try {
			    name.equals("Joe"); // causes NullPointerException
			} catch (NullPointerException e) {
			   throw e;
			}

		}

}
