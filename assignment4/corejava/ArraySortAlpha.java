package assignment4.corejava;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySortAlpha {
	


		public static void main(String[] args) {
			ArrayList<String> names = new ArrayList<String>();
			names.add("geetha");
			names.add("seetha");
			names.add("netra");
			names.add("revati");
			names.add("christina");
			names.add("dayana");
			names.add("vanita");
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
