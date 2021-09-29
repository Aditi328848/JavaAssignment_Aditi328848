package assignment1.corejava;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		/*
		 * 	Leap Years are any year that can be exactly divided by 4 (such as 2016, 2020, 2024, etc)
			 not	except if it can be exactly divided by 100, then it isn't (such as 2100, 2200, etc)
	 	 	yes	except if it can be exactly divided by 400, then it is (such as 2000, 2400)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();

		if(((year%4 == 0) &&  (year%100!=0)) || (year%400 == 0))  {

			System.out.println(year +" is leap year");

		}else {
			System.out.println(year +" is non leap year");
		}




	}

}

