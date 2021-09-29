package assignment1.corejava;
import java.util.Scanner;
public class AscendingOrder {


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of string array...");
		int size = sc.nextInt();
		String[] a = new String[size];
		System.out.println("Input Strings.....");
		for (int i = 0; i < size ; i++) {
			System.out.println("i - "+i);
			a[i] = sc.nextLine(); 
			System.out.println(a[i]);
		}
		System.out.println("Array before sorting....");

		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
		String temp = null;
		for (int i = 0; i < size; i++) { 
			for (int j = i+1; j < a.length; j++) {
				if(a[i].compareTo(a[j]) > 0) { //67 > 65 = +ve

					temp = a[i];
					a[i] = a[j]; 
					a[j] = temp; 
				} 
			}

		} 
		System.out.println("Afters sort...."); 
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]+ " ");
		}


	}

}
