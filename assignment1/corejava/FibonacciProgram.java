package assignment1.corejava;

public class FibonacciProgram {
public static void main(String[] args) {
		/*
		 * 2. Write a program to print fibonacci series (10 values).
	A series where the next term is the sum of previous two terms.
	The first two terms of the Fibonacci sequence is 0 followed by 1.
	The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
		 *   i , i+(i+1)
		 */
		int n1=0 , n2=1, n3 ;
		System.out.print(n1+ " " + n2 + " ");
		int s = 1;
		for (int i = 0; i < 8; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1=n2;
			n2=n3;
		}

	}

}

