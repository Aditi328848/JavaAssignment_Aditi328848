package assignment2.corejava;

public class AverageOfNumUsingArray {
	public static void main(String[] args) {
		/*
		 * Java Program to Calculate average of numbers using Array
Example:
values [] = 1, 2,3 4, 5
average = 3
		 */
		
		int[] avg = {6,2,3,4,5};
		int sum=0;
		for (int i = 0; i < avg.length; i++) {
			sum=sum+avg[i];
		}
		System.out.println(sum/avg.length);
	}
}
