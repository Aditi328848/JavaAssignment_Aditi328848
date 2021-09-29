package assignment4.corejava;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySortAlpha {
	


		public static void main(String[] args) {
			ArrayList<String> names = new ArrayList<String>();
			names.add("seetha");
			names.add("sudhin");
			names.add("Swetha");
			names.add("Neethu");
			names.add("ananya");
			names.add("Athira");
			names.add("bala");
			names.add("Tony");
			names.add("Karthika");
			names.add("Nithin");
			names.add("Vinod");
			names.add("jeena");
			System.out.println("Before Sorting");
			for (String string : names) {
				System.out.println(string);
			}
			System.out.println("After sorting");
			Collections.sort(names);
			
			for (String string : names) {
				System.out.println(string);
			}

		}

}
