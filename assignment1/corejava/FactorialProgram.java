package assignment1.corejava;
import java.util.Scanner;
public class FactorialProgram {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter number to find factorial....");
			int Factorial = sc.nextInt();
			int num = 1;
			int i= 1;
			
			while(i<=Factorial) {
				num = num * i;
				i++;
			}
			System.out.println(num);
		}

	}

